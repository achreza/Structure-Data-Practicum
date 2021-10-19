/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author 62852
 */
public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;
    
    public  void displayNode(){
        System.out.println("{ "+data+"} ");
    }
    public void displaydata(){
        System.out.println(data+" Adalah...");
    } 
}
