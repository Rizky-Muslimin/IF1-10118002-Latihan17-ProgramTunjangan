/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118002.latihan17.programtunjangan;
import java.util.Scanner;
/**
 * Nama      : Rizky Muslimin
 * Kelas     : IF-1
 * NIM       : 10118002
 * Deskripsi : menghitung besar tunjangan youglex
 */
public class IF110118002Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======= Program Tunjangan =======");
        System.out.print("Berapa Gaji Pokok Anda Perbulan?: Rp.");
        Scanner Uinput = new Scanner (System.in);
        
        double input = Uinput.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum) :");
        String user = Uinput.next();
        
        System.out.println("======= Hasil Perhitungan Gaji Anda =======");
        double tunjangan = ("Menikah".equals(user))?0.35*input:0;
        System.out.println("Gaji Pokok : Rp."+input);
        
        System.out.println("Tunjangan : Rp."+tunjangan);
        double totGaji = tunjangan + input;
        System.out.println("Total Gaji : Rp."+totGaji);
        
        
        
    }
}
        
