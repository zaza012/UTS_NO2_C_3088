/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.java.uts_no2_c_3088;

/**
 *
 * @author Fikri Fahmi Azim
 * 21103088
 * SI 05 C
 */


import java.util.Scanner;

public class UTS_NO2_C_3088 {

    public static void main(String[] args) {
        SalariedEmployee_3088 A = new SalariedEmployee_3088("Lucifer", 21103000, 3000000);
        CommissionEmployee_3088 B = new CommissionEmployee_3088("Astaroth", 21103001, 3500000, 1000000);
        ProjectPlanner_3088 C = new ProjectPlanner_3088("Belzebub", 21103002, 4000000, 2000000);
        
        System.out.println("==== DATA PEGAWAI PERUSAHAAN ====");
        A.cetakSalariedEmployee_3088();
        System.out.println("");
        B.cetakCommissionEmployees_3088();
        System.out.println("");
        C.cetakProjectPlanner_3088();
        System.out.println("");
    }
}
