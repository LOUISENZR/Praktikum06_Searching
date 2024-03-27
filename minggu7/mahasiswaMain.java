package minggu7;

import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        pencarianMahasiswa data = new pencarianMahasiswa();
        int jumMhs = 5;

        System.out.println("=====================================================");
        System.out.println("Masukan data mahasiswa secara urut dari NIM terkecil ");
        for (int i = 0; i<jumMhs; i++){
            System.out.println("---------------------------------------------");
            System.out.print("NIM\t : ");
            int nim = s.nextInt();
            System.out.print("NAMA\t: ");
            String nama = sl.nextLine();
            System.out.print("UMUR\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("=======================================================");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
        System.out.println("=======================================================");
        System.out.println("=======================================================");
        System.out.println("                       Pencarian Data                  ");
        System.out.println("                    Masukan NIM mahasiswa              ");
        System.out.print("NIM");
        int cari = s.nextInt();
        System.out.println("                 Menggunakan sequential search         ");
        int posisi = data.findSeqSearch(cari);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        System.out.println("=======================================================");
        System.out.println("                  Menggunakan Binary Search            ");
        posisi = data.findBinarySearch(cari, 0, jumMhs -1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
