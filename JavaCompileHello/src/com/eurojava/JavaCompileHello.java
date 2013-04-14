/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;


public class JavaCompileHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        
        int result = compiler.run(null, null, null,
                "\\path\\to\\Hello.java");

        System.out.println("Compile result code = " + result);
    }
}
