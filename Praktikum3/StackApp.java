/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Reza
 */
public class StackApp {

    public static void main(String[] args) {
        Stack theStack = new Stack(10);
        System.out.println(">> push some items ");
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        System.out.println("\n>> pop items in the stack");
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value + " ");
        }
    }
}
