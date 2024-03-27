package minggu7;

import java.util.Scanner;

public class mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    mahasiswa(int ni, String n, int u, double i){
        nim=ni;
        nama = n;
        umur = u;
        ipk=i;
    }

    void tampil(){
        System.out.println("NIM   = "+nim);
        System.out.println("NAMA  = "+nama);
        System.out.println("UMUR  = "+umur);
        System.out.println("IPK   = "+ipk);

    }

     
}
