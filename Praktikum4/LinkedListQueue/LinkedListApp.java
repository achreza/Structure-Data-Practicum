/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListQueue;

import LinkedListStack.*;

/**
 *
 * @author Reza
 */
public class LinkedListApp {

    public static void main(String[] args) {
       
        Queue queue = new Queue();
        
        queue.insert(1665100, "Dee");
        queue.insert(1665200, "Deaja");
        queue.displayList();
        
        queue.insert(1665300, "Ami");
        queue.insert(1665400, "Haya");
        queue.insert(1665500, "Yati");
        queue.displayList();
        
        queue.remove();
        queue.remove();
        queue.displayList();
        
        

    }
}
