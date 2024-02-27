public class DVD {
    private String judul;
    private String publisher;
    private String kategori;
    private int stok;
    
    public DVD(String judul, String publisher, String kategori, int stok){
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
    }

    public void viewData() {
        System.out.println("Judul: " + judul);
        System.out.println("Publisher: " + publisher);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
    }
}

