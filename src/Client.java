import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public void run() throws UnknownHostException, IOException {
        int port = 8010;
        InetAddress address = InetAddress.getByName("localhost");
        Socket socket = new Socket(address, port);

        PrintWriter toSocket = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner scanner = new Scanner(System.in);

        // Keep the client running to allow multiple interactions
        String input;
        System.out.println("Type your message (type 'exit' to close): ");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            toSocket.println(input);  // Send message to the server
            String serverResponse = fromSocket.readLine();  // Read response from server
            System.out.println("Server says: " + serverResponse);
        }

        // Close resources
        toSocket.close();
        fromSocket.close();
        socket.close();
        scanner.close();
    }

    public static void main(String[] args) {
        Client singleThreadedWebServer_Client = new Client();
        try {
            singleThreadedWebServer_Client.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
