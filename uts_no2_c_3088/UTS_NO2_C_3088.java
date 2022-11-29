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
        SalariedEmployee_3088 A[] = new SalariedEmployee_3088[1];
        ProjectPlanner_3088 B[] = new ProjectPlanner_3088[1];
        CommissionEmployee_3088 C[] = new CommissionEmployee_3088[1];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < A.length; i++){
                System.out.println("Input Salaried " + (i + 1));
                A[i] = new SalariedEmployee_3088();
                A[i].InputDataSalaried_3088();
                System.out.println("");
            }   
           
            for (int i = 0; i < A.length; i++){
                A[i].TampilDataSalaried_3088();
                System.out.println("");
            }
        
            for (int i = 0; i < B.length; i++){
                System.out.println("Input Project " + (i + 1));
                B[i] = new ProjectPlanner_3088();
                B[i].InputDataProject_3088();
                System.out.println("");
            }
        
            for (int i = 0; i < B.length; i++){
                B[i].TampilDataProject_3088();
                System.out.println("");
            }
            
            for (int i = 0; i < C.length; i++){
                System.out.println("Input Commission " + (i + 1));
                C[i] = new CommissionEmployee_3088();
                C[i].InputDataCommission_3088();
                System.out.println("");
            }
        
            for (int i = 0; i < C.length; i++){
                C[i].TampilDataCommission_3088();
                System.out.println("");
            }
    }
}
