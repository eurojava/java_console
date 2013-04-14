/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.logging.Logger;
import java.util.logging.Level;

public class LogLevelSetting {

    private static Logger logger = Logger.getLogger(LogLevelSetting.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        // log level = Level.INFO
        //
        logger.setLevel(Level.INFO);
        logger.severe("This message will be logged.");

        //
        // log level = Level.SEVERE
        //
        logger.setLevel(Level.SEVERE);
        logger.warning("This message won't be logged.");

        //
        // LOG OFF
        //
        logger.setLevel(Level.OFF);
        logger.info("All log is turned off.");

        //
        // LOG ON
        //
        logger.setLevel(Level.ALL);
        logger.info("Information message.");
        logger.warning("Warning message.");
        logger.severe("Severe message.");
    }
}
