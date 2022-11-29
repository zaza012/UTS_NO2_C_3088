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
    private int UpahMingguan_3088;
    double JumlahGaji_3088;
    
    public double TotalGajiSalaried_3088(){
        JumlahGaji_3088 = UpahMingguan_3088;
        return JumlahGaji_3088;
    }
    
    public void TampilDataSalaried_3088(){
        System.out.println("===== DATA SALARIED EMPLOYEE =====");
        tampilDataEmployess_3088();
        System.out.println("Upah Mingguan       : Rp " + UpahMingguan_3088);
        System.out.println("Jumlah Gaji         : Rp " + TotalGajiSalaried_3088());
    }
    
    public void InputDataSalaried_3088(){
        super.inputDataEmployess_3088();
        System.out.println("Upah Mingguan       : Rp ");
        UpahMingguan_3088 = Integer.parseInt(sc.nextLine());
    }
}
