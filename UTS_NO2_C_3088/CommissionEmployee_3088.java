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

public class CommissionEmployee_3088 extends employess_3088 {
    int komisi_3088, totalPenjualan_3088;
    
    public CommissionEmployee_3088(String Nama_3088, int NIP_3088, int komisi_3088, int totalPenjualan_3088){
        super(Nama_3088, NIP_3088);
        this.komisi_3088 = komisi_3088;
        this.totalPenjualan_3088 = totalPenjualan_3088;
    }
    public int HitungGaji_3088(){
        Gaji_3088 = Gaji_3088 + (komisi_3088 + totalPenjualan_3088);
        return Gaji_3088;
    }
    
    public void cetakCommissionEmployees_3088(){
        super.cetakEmployess_3088();
        System.out.println("Komisi                  :Rp. " + komisi_3088);
        System.out.println("Total Penjualan         :Rp. " + totalPenjualan_3088);
        System.out.println("Total Gaji              :Rp. " + HitungGaji_3088());
    }

}
