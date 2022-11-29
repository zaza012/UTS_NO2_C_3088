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

public class ProjectPlanner_3088 extends employess_3088 {
    private int GajiPokok_3088, Komisi_3088, TotalHasilProyek_3088;
    double TotalGaji_3088;
    
    public void TotalPendapatanProject_3088(){
        TotalGaji_3088 = GajiPokok_3088 + (Komisi_3088 * TotalHasilProyek_3088) - 5/100;
    }
    
    public void TampilDataProject_3088(){
        System.out.println("===== DATA PROJECT PLANNER =====");
        tampilDataEmployess_3088();
        System.out.println("Gaji Pokok          : Rp " + GajiPokok_3088);
        System.out.println("Komisi              : Rp " + Komisi_3088);
        System.out.println("Total Proyek        : Rp " + TotalHasilProyek_3088);
        System.out.println("Total Gaji          : Rp " + TotalPendapatanProject_3088());
    }
    
    public void InputDataProject_3088(){
        super.inputDataEmployess_3088();
        System.out.println("Upah Gaji Pokok     : Rp ");
        GajiPokok_3088 = Integer.parseInt(sc.nextLine());
        System.out.println("Upah Komisi         : Rp ");
        Komisi_3088 = Integer.parseInt(sc.nextLine());
        System.out.println("Total Proyek     : Rp ");
        TotalHasilProyek_3088 = Integer.parseInt(sc.nextLine());
    }
}
