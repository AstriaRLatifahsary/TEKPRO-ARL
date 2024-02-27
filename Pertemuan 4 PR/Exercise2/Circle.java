public class Circle extends Shape {
    private double radius;

    public Circle (){
        super();
        radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle (String color, boolean filled, double radius){
        super();
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return;
    }

    @Override
    public double getPerimeter(){

    }

    @Override
    public String toString(){
        return "Circle[Shape[color =" + color "filled =" + filled + "radius = " + radius
    
    }
    }
}
    }
