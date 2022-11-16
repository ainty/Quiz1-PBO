/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz1_c_3087;

/**
 *
 * @author Tyaa
 */
public class Dosen_3087 extends Penduduk_3087 {
    public String nidn_3087, golongan_3087;
    public int gajiPokok_3087, tunjangan_3087;
    public double gajiTotal_3087;
    
    public double totalPendapatan_3087(){
        switch(golongan_3087){
            case "IIIA" : 
                tunjangan_3087 = 300000;
            case "IIIB" :
                tunjangan_3087 = 500000;
            case "IIIC" :
                tunjangan_3087 = 700000;
        }
        
        gajiTotal_3087 = gajiPokok_3087 + tunjangan_3087;
        return gajiTotal_3087;
    }
    
    public void tampilDataDosen_3087(){
        CetakPenduduk_3087();
        System.out.println("NIDN        : " + nidn_3087);
        System.out.println("Golongan    : " + golongan_3087);
        System.out.println("Gaji Pokok  : " + gajiPokok_3087);
    }
}
