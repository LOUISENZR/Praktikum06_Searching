package minggu7;

import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        pencarianMahasiswa data = new pencarianMahasiswa();
        System.out.print("Masukan Jumlah Mahasiswa :");
        int jumMhs = s.nextInt();
        mahasiswa[] inputan = new mahasiswa[jumMhs];
        data.listMhs=inputan;
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
        System.out.println("                    Masukan nama mahasiswa              ");
        System.out.print("NAMA");
        String cari = sl.nextLine();
        System.out.println("                 Menggunakan binary search         ");
        int posisi = data.findBinarySearch(cari, 0, jumMhs-1);

        if(posisi==-1){
            System.out.println("Pencarian menghasilkan lebih dari satu hasil");

        }else if(posisi!=-1){
            data.tampilPosisi(cari, posisi);
            data.tampilData(cari, posisi);
        }else{
            System.out.println("Data "+ cari+"T idak ditemukan");
        }
        
    }
}
