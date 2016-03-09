/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kecepatanwaktu;

import java.util.Scanner;

public class MainWaktu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int jumlah = in.nextInt();
        int panjang = in.nextInt();
        int lebar = in.nextInt();
        
        KecepatanWaktu m[] = new KecepatanWaktu [jumlah];
        System.out.println("INPUT");
        for (int i = 0; i < jumlah; i++) {  
            m[i] = new KecepatanWaktu();
            String NIM = in.next();
            String nama_mahasiswa = in.next();
            int jumlahPutaran = in.nextInt();
            int jumlah_waktu = in.nextInt();
            m[i].HitungWaktu(NIM, nama_mahasiswa, jumlahPutaran, jumlah_waktu, panjang, lebar);
            m[i].hitungJarak(panjang, lebar);
            m[i].waktuTercepat();
        }
        System.out.println("OUTPUT");
        for (int i = 0; i < jumlah; i++) {
            m[i].DisplayMessage();
        }
        
        double max = 0;
        for (int k = 1; k <jumlah; k++){
            if (m[k].waktuTercepat()>m[k-1].waktuTercepat()){
                max = k;
            }
            }
        System.out.println(m[(int)max].displayNama());
    }
}


