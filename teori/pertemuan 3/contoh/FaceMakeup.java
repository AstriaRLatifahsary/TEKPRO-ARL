package contoh;

class FaceMakeup extends Makeup{
    private String foundation;
    private String concealer;
    private String blush;

    public FaceMakeup(String brand, String foundation, String concealer, String blush){
        super(brand);
        this.foundation = foundation;
        this.concealer = concealer;
        this.blush = blush;
    }
    
    @Override
    public void apply(){
        System.out.println(" Brand " + brand );
        System.out.println(" Foundation " + foundation );
        System.out.println(" Concealer " + concealer );
        System.out.println(" Blush " + blush );
    }
} 