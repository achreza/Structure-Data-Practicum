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
class Stack {

   
    Link top;

    public Stack() {
        
        this.top = null;
    }

    public void push(int id,String nama) 
    {
        Link temp = new Link(id,nama);  
        temp.next = top;
        top = temp;
    }
 
    public boolean isEmpty()
    {
        return top == null;
    }
 
    public Link peek()
    {
        if (!isEmpty()) {
            return top;
        }
        else {
            System.out.println("Stack Kosong");
            return null;
        }
    }

    public void pop() 
    {
        if (top == null) {
            System.out.print("\nData sudah habis");
            return;
        }
        top = top.next;
    }
 
    public void display()           
    {
        System.out.println("List(top -->bottom):"); 
        if (top == null) {
            System.out.printf("\nData kosong");       
        }
        else {
            Link temp = top;
            while (temp != null) {
 
                temp.displayLink();
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}
