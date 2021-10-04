/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursi;

import java.util.Scanner;

/**
 *
 * @author Reza
 */
public class RecursionHanoi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RecursionHanoi hanoi=new RecursionHanoi();
        
        System.out.print("Masukkan Jumlah Cakram :");
        int cakram=scanner.nextInt();
        System.out.println("Hasil Recursion :");
        hanoi.doMenara(cakram,'A' ,'B', 'C');
    }
    public void doMenara(int cakram, char first,char mid, char last){
        if (cakram==1) {
            System.out.println("Memindah cakram "+cakram+" dari "+first+" ke "+last);
        }
        else{
            doMenara(cakram-1, first, last, mid);
            System.out.println("Memindah cakram "+cakram+" dari "+first+" ke "+last);
            doMenara(cakram-1, mid, first, last);
        }
    }
}

//Menara Hanoi adalah sebuah permainan matematis atau teka-teki. 
//Permainan ini terdiri dari tiga tiang dan sejumlah cakram dengan 
//ukuran berbeda-beda yang bisa dimasukkan ke tiang mana saja. 
//Permainan dimulai dengan cakram-cakram yang tertumpuk rapi 
//berurutan berdasarkan ukurannya dalam salah satu tiang, cakram terkecil diletakkan teratas, sehingga membentuk kerucut.
