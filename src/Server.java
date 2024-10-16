import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public void run() throws IOException {
        int port=8010;
        ServerSocket socket=new ServerSocket(port);

        socket.setSoTimeout(30000);
        while(true){
            System.out.println("Server is continuosly listening on port:"+port);
            Socket acceptedConnection=socket.accept();
            System.out.println("Connected to:"+acceptedConnection.getRemoteSocketAddress());
            PrintWriter toClient=new PrintWriter(acceptedConnection.getOutputStream(),true);
            BufferedReader fromClient=new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
            toClient.println("Hello From Server");
        }
    }

    public static void main(String args[]){
        Server server=new Server();
        try{
            server.run();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


}
