/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profiertest;

/**
 *
 * @author Darek
 */
public class ProfilerTest {

    public static void main(String[] args) {
        ServerThread server = new ServerThread();
        server.start();
    }
}
