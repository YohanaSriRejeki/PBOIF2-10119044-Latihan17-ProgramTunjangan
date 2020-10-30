/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan total gaji dan 
 * tunjangannya
 */
public class PBOIF210119044Latihan17ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String status;
        double tunjangan,gapok,totalGaji;
 
            System.out.println("===========Program Tunjangan===========");
        
            System.out.print("Berapa gaji pokok anda per bulan?: Rp. ");
            gapok = input.nextInt();
            
            System.out.print("Status Anda? (Menikah/Belum)     : ");
            status = input.next();
            
            
            if("Menikah".equals(status) || "menikah".equals(status)) {
                tunjangan=(int) (0.35*gapok);
            } else {
                    tunjangan=0;
            }         
            
            totalGaji=tunjangan+gapok;
            
            System.out.println();
            System.out.println("===========Hasil Perhitungan Gaji Anda===========");
            System.out.println("Gaji Anda       : Rp " + gapok);
            System.out.println("Tunjangan       : Rp " + tunjangan);
            System.out.println("Total Gaji      : Rp " + totalGaji);
            System.out.println("(Developed by : Yohana Sri Rejeki)");
    }
    
}
