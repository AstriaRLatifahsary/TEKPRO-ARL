class DVDmusik extends DVD {
    private String penyanyi;
    private String produser;
    private String[] topHits;

    public DVDmusik (String judul, String publisher, String kategori, int stok, String penyanyi, String produser, String [] topHits) {
        super(judul, publisher, kategori, stok);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits;
    }

    @Override
    public void viewData() {
        super.viewData();
        System.out.println("Penyanyi: " + penyanyi);
        System.out.println("Produser: " + produser);
        System.out.print("Top Hits: ");
        for (String hit : topHits) {
            System.out.print(hit + ", ");
        }
        System.out.println();
    }
}
