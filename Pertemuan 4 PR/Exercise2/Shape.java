public class Shape {
    private String color;
    private boolean filled; 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape (){
        setColor(color);
        setFilled(filled);
    }

    public String toString() {
        return "Shape [color=" + color + "filled=?" + filled + "]";
    }

}
