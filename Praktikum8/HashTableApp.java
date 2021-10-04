/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Reza
 */
public class HashTableApp {
    public static void main(String[] args) throws IOException {
        int maxsize=15;
        HashTable theHash=new HashTable(maxsize);
        int value;
        
        theHash.insert(15);
        theHash.insert(30);
        theHash.insert(45);
        theHash.insert(60);
        
        
        theHash.insert(22);
        theHash.insert(15);
        theHash.insert(11);  
        theHash.insert(18);
        theHash.insert(20);
        theHash.insert(25);
        theHash.insert(60);
        theHash.insert(33);
        theHash.insert(35);
        theHash.insert(42);
        theHash.insert(6);
        theHash.insert(4);
        theHash.insert(26);
        theHash.insert(59);
        theHash.insert(13);
        
       
       while(true){
           System.out.print("Pilih antara show,insert, find,delete :");
           int choice=getChar();
           switch(choice){
               
               case 's':
                   theHash.displayTable();
                   break;
               case 'i':
                   System.out.print("Enter value to insert :");
                   value=getInt();
                   theHash.insert(value);
                   break;
                   
               case 'f':
                   System.out.print("Enter value to find: ");
                   value=getInt();
                   Data found=theHash.find(value);
                   if (found != null) {
                       System.out.println("Found :");
                       found.displayFind();
                   }else{
                       System.out.println("Could not found"+value);
                   }
               break;
               case 'd':
                   System.out.print("Enter value to delete: ");
                   value=getInt();
                   Data didDelete=theHash.delete(value);
                   if (didDelete !=null){
                       System.out.println("deleted : "+value);
                   }else{
                       System.out.println(value+" Could not deleted");
                   }
               break;
           }
           
       }
    }
    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
    public static char getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }
    
    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }
    
}
