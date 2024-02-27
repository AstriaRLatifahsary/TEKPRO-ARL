package contoh;

public class Main{
    public static void main(String[] args) {
        
        Makeup faceMakeup = new FaceMakeup("Maybelline", "liquid foundation", "stick", "powder");
        Makeup eyeMakeup = new EyeMakeup("pinkflash","eyeshadow palette", "liquid eyeliner", "waterproof mascara");
        Makeup lipMakeup = new LipMakeup("Dior", "matte lipstick", "shiny lip gloss", "red liptint");

        System.out.println("FaceMakeup : ");
        faceMakeup.apply();
        System.out.println(" ");

        System.out.println("EyeMakeup : ");
        eyeMakeup.apply();
        System.out.println(" ");

        System.out.println("LipMakeup : ");
        lipMakeup.apply();
    
    } 
}