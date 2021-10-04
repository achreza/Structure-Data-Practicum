/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListStack;

/**
 *
 * @author Reza
 */
public class LinkedListApp {

    public static void main(String[] args) {
       
        Stack stack = new Stack();
        
        stack.push(1, "TV");
        stack.push(2, "VCD");
        
        stack.display();
        
        stack.push(3, "Kulkas");
        stack.push(4, "PC");
        stack.push(5, "Rice Cooker");
        stack.push(6, "Dispenser");
        stack.display();
        
        stack.pop();
        stack.pop();
        stack.display();
        

    }
}
