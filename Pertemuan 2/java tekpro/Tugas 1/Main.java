public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Astria Rizka Latifahsary", 231524037);
        Perpustakaan perpustakaan = new Perpustakaan("Harry Potter", "J.K. Rowling", "Novel", 12345);

        mahasiswa.meminjamBuku(perpustakaan);
    }
}

