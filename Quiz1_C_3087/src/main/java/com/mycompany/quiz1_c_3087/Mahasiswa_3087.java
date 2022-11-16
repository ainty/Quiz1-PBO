/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1_c_3087;

/**
 *
 * @author Tyaa
 */
public class Mahasiswa_3087 extends Penduduk_3087 {
    public int nim_3087;
    public float jumlahIpk_3087;
    
    public void tampilDataMahasiswa_3087(){
        CetakPenduduk_3087();
        System.out.println("NIM : " + nim_3087);
        System.out.println("IPK : " + jumlahIpk_3087);
    }
    
    public void tampilBeasiswa_3087(){
        if(jumlahIpk_3087 >= 3.50){
            System.out.println("Mahasiswa bernama " + nama_3087 + " berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama " + nama_3087 + " tidak berhak mendapatkan beasiswa");
        }
    }
}
