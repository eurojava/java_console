/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;

public class LogConsoleHandler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogConsoleHandler.class.getName());

        //
        // Dodanie ConsoleHandler do Logger
        //
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);

        if (logger.isLoggable(Level.INFO)) {
            logger.info("This is information message for testing ConsoleHandler");
        }
    }
}
