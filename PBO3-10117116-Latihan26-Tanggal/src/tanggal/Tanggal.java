/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanggal;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Menampilkan Tanggal dan Waktu
 *  
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Tanggal {

    /**
     * @param args the command line arguments
     */
    
    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat ("EEEE,dd MMM yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat ("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    
    
    public static void main(String[] args) {
        Tanggal tgl = new Tanggal();
        System.out.println("Hari Ini Adalah Hari : " + tgl.getTanggal() +" "
                + ""+  tgl.getWaktu()) ;
        
    }
    
}
