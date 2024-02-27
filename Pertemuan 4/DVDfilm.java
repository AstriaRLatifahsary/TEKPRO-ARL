class DVDfilm extends DVD {
    private String pemeran;
    private String sutradara;

    public DVDfilm (String judul, String publisher, String kategori, int stok, String pemeran, String sutradara) {
        super(judul, publisher, kategori, stok);
        this.pemeran = pemeran;
        this.sutradara = sutradara;
    }

    @Override
    public void viewData() {
        super.viewData();
        System.out.println("Pemeran: " + pemeran);
        System.out.println("Sutradara: " + sutradara);
    }
}