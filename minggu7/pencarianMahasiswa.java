package minggu7;

public class pencarianMahasiswa {
    mahasiswa listMhs[]= new mahasiswa[5];
    int idx;
    void tambah(mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx]=m;
            idx++;    
        } else{
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil(){
        for(mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-------------------------------------");
        }
    }
    public int findSeqSearch(int cari){
        int posisi = -1;
        for(int  j=0; j< listMhs.length; j++){
            if (listMhs[j].nim==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    } 
    public void tampilPosisi(int x, int pos){
        if (pos !=-1){
            System.out.println("data "+ x +" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+ x +" tidak ditemukan");
        }
    }
    public void tampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("NIM\t  : "+x);
            System.out.println("NAMA\t : "+listMhs[pos].nama);
            System.out.println("UMUR\t : "+listMhs[pos].umur);
            System.out.println("IPK\t  : "+listMhs[pos].ipk);
        }else{
            System.out.println("data "+x+" todak ditemukan");

        }
    }
       
    
}
