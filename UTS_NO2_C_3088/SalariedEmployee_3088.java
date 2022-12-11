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

public class SalariedEmployee_3088 extends employess_3088 {
    int upahMingguan_3088, Gaji_3088;
    
    public SalariedEmployee_3088(String Nama_3088, int NIP_3088, int upahMingguan_3088){
        super(Nama_3088, NIP_3088);
        this.upahMingguan_3088 = upahMingguan_3088;
    }
    public int HitungGaji_3088(){
     Gaji_3088 = upahMingguan_3088;
     return Gaji_3088;
    }
    
    public void cetakSalariedEmployee_3088(){
        super.cetakEmployess_3088();
        System.out.println("Upah Mingguan           :Rp. " + HitungGaji_3088());
    }
}
