/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListQueue;

/**
 *
 * @author Reza
 */
class Queue {
    Link front, rear;
 
    public Queue()
    {
        this.front = this.rear = null;
    }
    void insert(int nim,String nama)
    {
        Link temp = new Link(nim,nama);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }
 
    void remove()
    {
        if (this.front == null)
            return;

        Link temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
    
    public void displayList() {
        System.out.println("List(front -->rear):"); 
        Link current = front;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
