/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak9;

/**
 *
 * @author Reza
 */
public class HeapApp {
    public static void main(String[] args) {
        int maxSize=35;
        Heap theHeap=new Heap(maxSize);
        System.out.println("Sebelum urut :");
        System.out.println("");
        theHeap.insertAt(0, 100);
        theHeap.insertAt(1, 90);
        theHeap.insertAt(2, 80);
        theHeap.insertAt(3, 30);
        theHeap.insertAt(4, 60);
        theHeap.insertAt(5, 50);
        theHeap.insertAt(6, 70);
        theHeap.insertAt(7, 20);
        theHeap.insertAt(8, 10);
        theHeap.insertAt(9, 40);
        theHeap.insertAt(10, 55);
        theHeap.insertAt(11, 45);
       
        
        theHeap.displayHeap();
        theHeap.remove();
        theHeap.displayHeap();
        System.out.println("setelah insert :");
        theHeap.insertAt(12, 48);
        theHeap.displayHeap();
        
        System.out.println("Setelah Urut :");
        theHeap.HeapSortDescending();
        theHeap.displayArray();
        theHeap.displayHeap();
        System.out.println("Setelah remove :");
        theHeap.remove();
        theHeap.displayHeap();
        
    }
    
}
