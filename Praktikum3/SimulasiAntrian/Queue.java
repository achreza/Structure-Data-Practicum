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
class Queue {

    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    private boolean stop;

    public Queue(int size) {
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
        stop = false;
    }

    public void insert(String value) {
        if (isFull()) {
            System.out.println("Maaf " + value + ", antrian masih penuh");
           
        } else {
            queArray[++rear] = value;
            System.out.println(value + " masuk antrian");
            nItems++;
        }

    }


    public String peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

    public String remove() {
        String temp = queArray[front];
        queArray[front] = "Kosong";
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        System.out.println(temp+" keluar antrian");
        return temp;
    }
    public void display() {
        int temp = this.front;
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[front++]+",");
            if (front == maxSize) {
                front = 0;
            }
        }
        System.out.println("\n");
        front = temp;
    }
}
