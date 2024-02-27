package contoh;

class EyeMakeup extends Makeup{
    private String eyeshadow;
    private String eyeliner;
    private String mascara;

    public EyeMakeup(String brand, String eyeshadow, String eyeliner, String mascara){
        super(brand);
        this.eyeshadow = eyeshadow;
        this.eyeliner = eyeliner;
        this.mascara = mascara;
    }
    
    @Override
    public void apply(){
        System.out.println(" Brand " + brand );
        System.out.println(" Eyeshadow " + eyeshadow );
        System.out.println(" Eyeliner " + eyeliner );
        System.out.println(" Mascara " + mascara );
    }
} 