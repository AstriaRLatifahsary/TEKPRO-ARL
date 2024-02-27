public class Mahasiswa {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

        public void mahasiswa() {
            System.out.println(nama + " memimjam buku di perpustakaan.");
        }

        public String getNama() {
            return nama; 
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getNIM() {
            return nim; 
        }

        public void setNIM(int nim) {
            this.nim = nim;
        }

}

public class Perpustakaan {
    private String judul;
    private String penulis;

    public Perpustakaan(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis; 
    }

    public void peminjamanBuku(Mahasiswa mahasiswa){
        System.out.println(mahasiswa.getJudul() + "telah meminjam buku" + judul);
    }
    
    public String getJudul(){
        return judul;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Astria Rizka Latifahsary", 231524037);
        Perpustakaan perpustakaan = new Perpustakaan("AA", "BB");

        perpustakaan.peminjamanBuku(mahasiswa);
        mahasiswa.mahasiswa();
    }

    
}
