/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.uts_no2_c_3088;

/**
 *
 * @author Fikri Fahmi Azim
 * 21103088
 * SI 05 C
 */

import java.util.Scanner;

public class employess_3088 {
    protected int NIP_3088, Gaji_3088;
    protected String Nama_3088;
        
    public employess_3088(String Nama_3088, int NIP_3088){
        this.Nama_3088 = Nama_3088;
        this.NIP_3088 = NIP_3088;  
    }
    
    public int HitungGaji_3088(){
        return Gaji_3088;
    }
    public void cetakEmployess_3088(){
        System.out.println("Nama Karyawan           :" + Nama_3088);
        System.out.println("NIP                     :" + NIP_3088);
    }
}
