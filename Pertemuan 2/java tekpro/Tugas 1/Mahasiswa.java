public class Mahasiswa {
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
        public void meminjamBuku(Perpustakaan perpustakaan) {
        System.out.println(nama + " (" + nim + ")" + " meminjam buku " + perpustakaan.getJudul() + " di perpustakaan.");
        System.out.println("Keterangan: " );
        System.out.println(" " + "judul :" + perpustakaan.getJudul() );
        System.out.println(" " + "penulis :" + perpustakaan.getPenulis() );
        System.out.println(" " + "tipe buku : " + perpustakaan.getTipeBuku() );
        System.out.println(" " + "no buku : " + perpustakaan.getNoBuku() );
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
