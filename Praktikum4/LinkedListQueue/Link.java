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
class Link {

    public int nim;
    public String nama;
    public Link next;

    public Link(int id,String nama) {
        this.nim = id;
        this.nama = nama;
    }

    public void displayLink() {
        System.out.print(nim +","+nama+"\n"); 
 } 
}
