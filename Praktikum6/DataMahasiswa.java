/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak6;

/**
 *
 * @author Reza
 */
public class DataMahasiswa {
     public static void main(String[] args) {
        int max=100;
        AdvSort arr;
        arr=new AdvSort(max);
        
        arr.insert(16650210, "jundi", "Malang");
        arr.insert(16650200, "Ahmad", "Sidoarjo");
        arr.insert(16650240, "Ismail", "banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650220, "Dinda", "Bandung");
        arr.insert(16650280, "rais", "Ambon");
        arr.insert(16650270, "halo", "surabaya");
        arr.insert(16650250, "nunung", "ponorogo");
        arr.insert(16650260, "yati", "bali");
        
        System.out.println("Sebelum Urut "+arr.display());
        
        arr.mergeSort();
        arr.display();
        arr.ShellSort();
        arr.display();
        arr.QuickSort();
        arr.display();
        
        
    }
}
