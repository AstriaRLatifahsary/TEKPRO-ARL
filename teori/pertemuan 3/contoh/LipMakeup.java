package contoh;

class LipMakeup extends Makeup{
    private String lipstick;
    private String lipgloss;
    private String liptint;

    public LipMakeup(String brand, String lipstick, String lipgloss, String liptint){
        super(brand);
        this.lipstick = lipstick;
        this.lipgloss = lipgloss;
        this.liptint = liptint;
    }
    
    @Override
    public void apply(){
        System.out.println(" Brand " + brand );
        System.out.println(" Lipstick " + lipstick );
        System.out.println(" Lipgloss " + lipgloss );
        System.out.println(" Liptint " + liptint );
    }
} 