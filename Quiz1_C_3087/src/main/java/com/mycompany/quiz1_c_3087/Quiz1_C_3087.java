/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quiz1_c_3087;

/**
 *
 * @author Tyaa
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quiz1_C_3087 {

    public static void main(String[] args) {
        Mahasiswa_3087 M1 = new Mahasiswa_3087();
        Mahasiswa_3087 M2 = new Mahasiswa_3087();
        Dosen_3087 D1 = new Dosen_3087();
        Dosen_3087 D2 = new Dosen_3087();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("NIK     :");
            M1.nik_3087 = br.readLine();
            System.out.println("Nama    :");
            M1.nama_3087 = br.readLine();
            System.out.println("Umur    :");
            M1.umur_3087 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  :");
            M1.alamat_3087 = br.readLine();
            System.out.println("NIM     :");
            M1.nim_3087 = Integer.parseInt(br.readLine());
            System.out.println("IPK     :");
            M1.jumlahIpk_3087 = Float.parseFloat(br.readLine());
            System.out.println("");
            
            System.out.println("NIK     :");
            M2.nik_3087 = br.readLine();
            System.out.println("Nama    :");
            M2.nama_3087 = br.readLine();
            System.out.println("Umur    :");
            M2.umur_3087 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  :");
            M2.alamat_3087 = br.readLine();
            System.out.println("NIM     :");
            M2.nim_3087 = Integer.parseInt(br.readLine());
            System.out.println("IPK     :");
            M2.jumlahIpk_3087 = Float.parseFloat(br.readLine());
            System.out.println("");
            
            System.out.println("NIK         :");
            D1.nik_3087 = br.readLine();
            System.out.println("Nama        :");
            D1.nama_3087 = br.readLine();
            System.out.println("Umur        :");
            D1.umur_3087 = Integer.parseInt(br.readLine());
            System.out.println("Alamat      :");
            D1.alamat_3087 = br.readLine();
            System.out.println("NIDN        :");
            D1.nidn_3087 = br.readLine();
            System.out.println("Golongan    :");
            D1.golongan_3087 = br.readLine();
            System.out.println("Gaji Pokok  :");
            D1.gajiPokok_3087 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("NIK         :");
            D2.nik_3087 = br.readLine();
            System.out.println("Nama        :");
            D2.nama_3087 = br.readLine();
            System.out.println("Umur        :");
            D2.umur_3087 = Integer.parseInt(br.readLine());
            System.out.println("Alamat      :");
            D2.alamat_3087 = br.readLine();
            System.out.println("NIDN        :");
            D2.nidn_3087 = br.readLine();
            System.out.println("Golongan    :");
            D2.golongan_3087 = br.readLine();
            System.out.println("Gaji Pokok  :");
            D2.gajiPokok_3087 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("====== DATA DOSEN ======");
            D1.tampilDataDosen_3087();
            System.out.println("Total Pendapatan : Rp " + D1.gajiTotal_3087);
            System.out.println("");
            System.out.println("Total Pendapatan : Rp " + D2.gajiTotal_3087);
            
            System.out.println("====== DATA MAHASISWA ======");
            M1.tampilDataMahasiswa_3087();
            M1.tampilDataMahasiswa_3087();
            System.out.println("");
            M2.tampilDataMahasiswa_3087();
            M2.tampilBeasiswa_3087();
        }
        catch(IOException eox){
            System.out.println(eox);
        }
    }
}
