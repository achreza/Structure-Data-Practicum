/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak10;

/**
 *
 * @author Reza
 */
public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public Stack(int size){
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }
    public void push(int item){
        stackArray[++top]=item;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top==maxSize-1);
    }
    
}
