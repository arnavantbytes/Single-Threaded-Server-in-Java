
# Single-Threaded Server-Client Application in Java

This project demonstrates a basic single-threaded client-server architecture using Java Sockets. The server listens for incoming connections, while the client connects, sends a message, and receives a response.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Usage](#usage)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Introduction

In this project, you will learn how to build a simple client-server model using Java. The server listens for client connections on a specified port and responds with a message once a client connects. This application is built using Java's `Socket` and `ServerSocket` classes to establish communication over the network.

## Features

- **Client-Server Communication**: The server listens for incoming client connections, and the client sends and receives messages.
- **Timeout Mechanism**: The server has a timeout period for client connections.
- **Looped Communication**: The client can send multiple messages, and the server will dynamically respond to each message.
- **Terminal-Based Interaction**: This project runs through the command line in separate terminals for the client and server.

## Project Structure

```bash
.
├── src
│   ├── Client.java
│   ├── Client.class
│   ├── Server.java
│   └── Server.class
└── README.md
```

- `Client.java`: The client-side source code.
- `Client.class`: The compiled bytecode for the client.
- `Server.java`: The server-side source code.
- `Server.class`: The compiled bytecode for the server.

## Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- A text editor or an IDE (IntelliJ IDEA, VS Code, etc.)
- Basic understanding of Java and networking concepts

## Setup Instructions

### 1. Clone the Repository

Use the following command to clone the repository:

```bash
git clone https://github.com/arnavantbytes/Single-Threaded-Server-in-Java.git
```

Navigate to the project directory:

```bash
cd Single-Threaded-Server-in-Java/src
```

### 2. Compile the Server and Client

In one terminal window, compile the server:

```bash
javac Server.java
```

In a separate terminal window, compile the client:

```bash
javac Client.java
```

### 3. Run the Server

In the server terminal, run the server:

```bash
java Server
```

### 4. Run the Client

In the client terminal, run the client:

```bash
java Client
```

## Usage

- **Server**: The server listens for incoming connections on port `8010`. Once a client connects, the server prints the connection details and responds with a message.
- **Client**: The client connects to the server at `localhost:8010`, sends a message, and prints the server's response.

### Sample Output

- **Server**:

```bash
Server is listening on port: 8010
Connected to /127.0.0.1:57984
Received from client: Hello World from socket /127.0.0.1:57984
```

- **Client**:

```bash
Type your message (type 'exit' to close):
Hello, Server!
Server says: Server received: Hello, Server!
```

## Troubleshooting

1. **Port Mismatch**: Ensure the same port (`8010`) is used in both `Server.java` and `Client.java`.
2. **Server Timeout**: The server waits for a client connection for 20 seconds before timing out. Modify the timeout value with `socket.setSoTimeout()` as needed.
3. **Firewall Issues**: If running on different machines, ensure firewall settings allow communication on the specified port.
4. **Permissions**: Ensure you have the necessary read/write permissions in the directory where the server and client are run.

## Contributing

Contributions are welcome! Feel free to open issues, submit pull requests, or fork the repository for any improvements or bug fixes.

To contribute:
1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/AmazingFeature`.
3. Commit your changes: `git commit -m 'Add some AmazingFeature'`.
4. Push to the branch: `git push origin feature/AmazingFeature`.
5. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

This README now includes the `.class` files as part of the project structure. Let me know if you need any further modifications!
