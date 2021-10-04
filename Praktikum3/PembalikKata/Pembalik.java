/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PembalikKata;

/**
 *
 * @author Reza
 */
public class Pembalik {
    
    String kataBalik;
    
    public void Balik(String kata,Stack stack){
        char isi;
        for (int i=0;i<kata.length();i++){
            isi = kata.charAt(i);
            stack.push(isi);
        }
    } 
    public String getBalik(Stack stack){
        kataBalik = "";
        while(!stack.isEmpty()){
            kataBalik += stack.pop();
        }
        return kataBalik;
    }
    
}
