/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profiertest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darek
 */
public class ServerThread extends Thread {

    ServerSocket s;
    final int port = 16000;
    final Vector<ClientThread> clients = new Vector<ClientThread>();

    public ServerThread() {
        super("ServerThread");
    }

    @Override
    public void run() {
        try {
            System.out.println("Server is ready and run...");
            // new socket
            s = new ServerSocket(port);
            while (true) {
                // accept new connection
                Socket s1 = s.accept();
                // create new thread
                ClientThread ct1 = new ClientThread(s1, clients);
                synchronized (clients) {
                    // add new client to vector
                    clients.add(ct1);
                }
                // run client thread
                ct1.start();
                System.out.println("Added New Client");
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }
    }
}