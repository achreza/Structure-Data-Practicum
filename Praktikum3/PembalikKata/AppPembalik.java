/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PembalikKata;

import java.util.Scanner;

/**
 *
 * @author Reza
 */
public class AppPembalik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack theStack = new Stack(10);
        Pembalik balik = new Pembalik();
        while (true) {
            System.out.print("Masukkan Kata : ");
            String kata = input.nextLine();
            balik.Balik(kata, theStack);
            System.out.println("kebalikan : " + balik.getBalik(theStack));
        }

    }

}
