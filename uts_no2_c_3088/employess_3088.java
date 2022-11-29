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
    protected String nama_3088, nip_3088;
    Scanner sc = new Scanner(System.in);
    
    public void tampilDataEmployess_3088(){
        System.out.println("Nama        : " + nama_3088);
        System.out.println("Nip         : " + nip_3088);
    }
    
    public void inputDataEmployess_3088(){
        System.out.println("NIK                 : ");
        nama_3088 = sc.nextLine();
        System.out.println("Nama                : ");
        nip_3088 = sc.nextLine();
    }
}
