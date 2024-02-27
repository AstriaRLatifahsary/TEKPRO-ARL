package contoh;

public abstract class Makeup{
    protected String brand;

    public Makeup(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void apply();
    
} 