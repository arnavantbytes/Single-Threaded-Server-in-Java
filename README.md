
# Single Threaded Server-Client Application in Java

This project demonstrates a basic single-threaded client-server architecture using Java. The server listens for incoming connections on a specified port, and the client establishes a connection to the server. Once connected, the client can send messages, and the server responds back.

## Project Structure

- **Server.java**: The server-side program that listens for incoming client connections and responds with a simple message.
- **Client.java**: The client-side program that connects to the server, sends a message, and receives a response from the server.

## Features

- Simple client-server communication using Java sockets.
- Server listens for incoming connections on a specific port.
- The client connects to the server and sends a message.
- The server responds to the client with a predefined message.
- Includes a timeout mechanism for the server's socket connection.

## Prerequisites

- Java JDK (version 8 or higher) installed.
- A text editor or IDE (e.g., VS Code, IntelliJ IDEA, etc.).
- Basic knowledge of Java and networking.

## Getting Started

### 1. Cloning the Repository

```bash
git clone https://github.com/arnavantbytes/Single-Threaded-Server-in-Java.git
cd Single-Threaded-Server-In-Java
```

### 2. Running the Server

1. Navigate to the directory where the `Server.java` file is located.
   
   ```bash
   cd src
   ```

2. Compile the server code:

   ```bash
   javac Server.java
   ```

3. Run the server:

   ```bash
   java Server
   ```

4. The server will start listening for incoming client connections on port `8010`.

### 3. Running the Client

1. In a **new terminal** window, navigate to the directory where the `Client.java` file is located.
   
   ```bash
   cd src
   ```

2. Compile the client code:

   ```bash
   javac Client.java
   ```

3. Run the client:

   ```bash
   java Client
   ```

4. The client will connect to the server on `localhost:8010` and exchange a simple message.

### 4. Output

- **Server Output:**

   The server will print a message indicating that it is listening for a connection. Once the client connects, the server will display the client’s address and send a message back.

   ```
   Server is listening on port: 8010
   Connected to /127.0.0.1:57984
   ```

- **Client Output:**

   The client will send a message to the server and print the server's response.

   ```
   Server says: Hello World from the server
   ```

## Code Overview

### **Server.java**
- **port = 8010**: The port on which the server listens for connections.
- **ServerSocket socket = new ServerSocket(port)**: This creates a server socket bound to the specified port.
- **socket.accept()**: The server waits for incoming connections and accepts them when a client connects.
- **PrintWriter** and **BufferedReader**: Used to send a response to the client and receive messages from the client.

### **Client.java**
- **InetAddress address = InetAddress.getByName("localhost")**: The client connects to the server at the `localhost` address.
- **Socket socket = new Socket(address, port)**: This creates a socket and connects to the server on the specified port.
- **toSocket.println(...)**: The client sends a message to the server.
- **fromSocket.readLine()**: The client receives a message from the server.

## Customizing the Project

- You can modify the port number in both `Server.java` and `Client.java` to experiment with different ports.
- Modify the communication message between client and server by changing the text in the `PrintWriter` methods.

## Troubleshooting

1. **Port Mismatch**: Ensure both client and server are using the same port (default is `8010`).
2. **Server Timeout**: The server has a 30-second timeout for client connections. You can adjust this by modifying the `socket.setSoTimeout(30000)` line in the server code.
3. **Firewall Issues**: If you're running the server and client on different machines, ensure that the firewall is not blocking the communication.

## Contributing

Feel free to submit issues, fork the repository, or send pull requests for any improvements or bug fixes.

## License

This project is open-source and available under the [MIT License](LICENSE).
