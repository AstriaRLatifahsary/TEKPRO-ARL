public class Perpustakaan {
    private String judul;
    private String penulis;
    private String tipeBuku;
    private int noBuku;

    public Perpustakaan(String judul, String penulis, String tipeBuku, int noBuku){
        this.judul = judul;
        this.penulis = penulis;
        this.tipeBuku = tipeBuku;
        this.noBuku = noBuku; 
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

    public String getTipeBuku(){
        return tipeBuku;
    }

    public void setTipeBuku(String tipeBuku){
        this.tipeBuku = tipeBuku;
    }

    public int getNoBuku(){
        return noBuku;
    }

    public void setNoBuku(int noBuku){
        this.noBuku = noBuku;
    }
}
