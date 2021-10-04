/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulasiAntrian;

/**
 *
 * @author Reza
 */
public class AntrianApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(4);
        System.out.println(">> beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satrio");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");

        System.out.println("\n>> isi antrian");
        theQueue.display();
        System.out.println("");
        System.out.println(">> satu persatu mulai keluar antrian");
        while (!theQueue.isEmpty()) {
            if (theQueue.peekFront().equals("Kosong")) {
                break;
            }
            String n = theQueue.remove();

            theQueue.display();
            System.out.print(" ");

        }
        System.out.println("Antrian kosong");
                System.out.println("0 Person");
                theQueue.display();
        System.out.println("");
    }
}
