public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok; 
    private static byte id=0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];

        defaultMakanan();
    }

    private void defaultMakanan(){
        tambahMenuMakanan ("Bala-Bala", 1_000, 20);
        tambahMenuMakanan("Gehu     ", 1_000, 20);
        tambahMenuMakanan("Tahu     ", 1_000, 0);
        tambahMenuMakanan("Molen    ", 1_000, 20);
    }

    public void tambahMenuMakanan (String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;

        nextId();
    }

    public void tampilMenuMakanan() {
        for (int i=0; i<id; i++){
            if(!isOutOfStock(i)) {
                System.out.println(i + ". " + nama_makanan[i] + "["+stok[i]+"]"+"\tRp. "+ harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public void pesanMenu(int id, int jumlah) {
        if (id >= 0 && id < this.id && stok[id] >= jumlah) {
            stok[id] -= jumlah;
            System.out.println("Pesanan Anda: " + nama_makanan[id] + " sejumlah " + jumlah);
        } else {
            System.out.println("Menu tidak tersedia atau stok tidak mencukupi.");
        }
    }
    
    public static void nextId() {
        id++;
    }
}
