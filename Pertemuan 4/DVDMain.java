public class DVDMain {

    public static void main(String[] args) {
        // Membuat objek DVD Film
        DVDfilm dvdFilm = new DVDfilm("AA", "BB", "CC", 32, "DD", "EE");
        dvdFilm.viewData();

        // Membuat objek DVD Musik
        String[] topHits = {"Thriller", "Beat It", "Billie Jean"};
        DVDmusik dvdMusik = new DVDmusik("AA", "BB", "CC", 12, "DD", "EE", topHits);
        dvdMusik.viewData();
    }
}