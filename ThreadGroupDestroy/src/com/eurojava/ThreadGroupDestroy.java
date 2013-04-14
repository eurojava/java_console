/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

public class ThreadGroupDestroy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadGroup grandParent = new ThreadGroup("GrandParent");
        ThreadGroup uncle = new ThreadGroup(grandParent, "Uncle");
        ThreadGroup parent = new ThreadGroup(grandParent, "Parent");
        ThreadGroup son = new ThreadGroup(parent, "Son");
        ThreadGroup daughter = new ThreadGroup(parent, "Daughter");
        ThreadGroup neighbour = new ThreadGroup("Neighbour");

        ThreadGroup[] groupArray = {
            grandParent, uncle, parent, son, daughter, neighbour
        };

        //
        // grupa i podgrupy
        //
        parent.destroy();

        
        // 
        // GrandParent, Uncle, and Neighbour nie są zniszczone
        // bo nie są w grupie parent
        //
        for (ThreadGroup tg : groupArray) {
            if (tg.isDestroyed()) {
                System.out.println(tg.getName() + " is destroyed");
            } else {
                System.out.println(tg.getName() + " is not destroyed");
            }
        }
    }
}
