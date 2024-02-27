import java.util.Scanner;
public class RestaurantMain {
    public static void main(String[] a2gs){
        Scanner scanner = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nSelamat datang di Restoran!");
            System.out.println("1. Tampilkan Menu Makanan");
            System.out.println("2. Pesan Menu");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    menu.tampilMenuMakanan();
                    break;  
                case 2:
                    System.out.print("Masukkan ID menu yang ingin dipesan: ");
                    int idPesan = scanner.nextInt();
                    System.out.print("Masukkan jumlah yang ingin dipesan: ");
                    int jumlahPesan = scanner.nextInt();
                    menu.pesanMenu(idPesan, jumlahPesan);
                    menu.tampilMenuMakanan();
                    break;
                case 3:
                    lanjut = false;
                    break;
                default: 
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
        System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
    }
}