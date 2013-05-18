/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profilerclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Darek
 */
public class ProfilerClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Thread> v = new Vector<Thread>();
        for (int i = 0; i < 100; i++) {

            // create new thread
            Thread t1 = new Thread("Client #: " + i) {
                public void run() {
                    BufferedReader reader = null;
                    BufferedWriter writer = null;
                    try {
                        // connect to server port 16000
                        Socket s = new Socket("localhost", 16000);
                        writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                        reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        // send thread name
                        writer.write(getName() + "\r\n");
                        writer.flush();
                        // print received text
                        System.out.println(reader.readLine());
                        reader.close();
                        writer.close();
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(ProfilerClient.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(ProfilerClient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            v.add(t1);
        }

        for (int i = 0; i < 100; i++) {
            v.elementAt(i).start();
        }
    }
}