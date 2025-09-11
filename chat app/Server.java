import java.io.*;
import java.net.*;
import java.util.*;

class Server {
    ServerSocket server;
    List<PrintWriter> clientWriters = new ArrayList<>();

    // constructor
    public Server() {
        try {
            // Bind the server to all network interfaces (use 0.0.0.0)
            server = new ServerSocket(7777);
            System.out.println("Server is ready to accept connections on port 7777...");
            System.out.println("Waiting for clients...");

            while (true) {
                // Accept incoming client connection
                Socket socket = server.accept();
                System.out.println("Client connected!");

                // Create input and output streams for the client
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Auto-flush enabled

                // Add the client's output stream to the list
                synchronized (clientWriters) {
                    clientWriters.add(out);
                }

                // Start separate threads for reading and writing for each client
                new Thread(new ClientHandler(socket, br, out)).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Broadcast message to all clients
    public void broadcastMessage(String message) {
        synchronized (clientWriters) {
            for (PrintWriter writer : clientWriters) {
                writer.println(message);
            }
        }
    }

    // Inner class to handle each client
    class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedReader br;
        private PrintWriter out;

        public ClientHandler(Socket socket, BufferedReader br, PrintWriter out) {
            this.socket = socket;
            this.br = br;
            this.out = out;
        }

        @Override
        public void run() {
            try {
                // Thread to read messages from the client
                String msg;
                while ((msg = br.readLine()) != null) {
                    if (msg.equalsIgnoreCase("exit")) {
                        System.out.println("Client disconnected.");
                        synchronized (clientWriters) {
                            clientWriters.remove(out);
                        }
                        break;
                    }
                    System.out.println("Client: " + msg);
                    broadcastMessage("Client: " + msg);
                }
            } catch (IOException e) {
                System.out.println("Error reading from client.");
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting server...");
        new Server();
    }
}
