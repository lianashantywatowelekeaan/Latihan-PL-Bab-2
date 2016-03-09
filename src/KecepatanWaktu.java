/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kecepatanwaktu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KecepatanWaktu {
    
    private String nama_mahasiswa;
    private String NIM;
    double  jumlahPutaran;
    double jumlah_waktu;
    double waktuTercepat;
    double hitungJarak;
    int keliling;
    int panjang;
    int lebar;
    
    
    public void HitungWaktu(String NIM,String nama_mahasiswa,int jumlahPutaran,int jumlah_waktu, int panjang, int lebar){
        this.NIM=NIM;
        this.nama_mahasiswa= nama_mahasiswa;
        this.jumlahPutaran= jumlahPutaran;
        this.jumlah_waktu= jumlah_waktu;
        
    }

    
    public double hitungJarak (int panjang, int lebar){
        keliling = 2*(panjang+lebar);
        hitungJarak = this.jumlahPutaran*keliling;
        return hitungJarak;
    }
    
    public double waktuTercepat () {
        waktuTercepat= this.jumlahPutaran/this.jumlah_waktu;
        return waktuTercepat;
    }
    public void DisplayMessage () {
        System.out.printf("%s %.0f \n",nama_mahasiswa,hitungJarak);   
    }
    public String displayNama(){
    return nama_mahasiswa;
    }
}

    
    
    
    

   
        
    
    

