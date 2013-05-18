/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profiertest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darek
 */
public class ClientThread extends Thread {

    final private Vector clients;
    private Socket s;
    private static int id = 0;

    public ClientThread(Socket s, Vector c) {
        super("ClientThread" + id);
        id++;
        this.s = s;
        this.clients = c;
    }

    public void run() {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            String line = reader.readLine();
            writer.write(line + "\r\n");
            writer.flush();
            synchronized (clients) {
                clients.remove(this);
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
                writer.close();
                this.finalize();
            } catch (IOException ex) {
                Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Throwable ex) {
                Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}