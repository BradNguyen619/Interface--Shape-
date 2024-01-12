public class Sides8 implements Shape
{
    private int height;
    private int base;
    private String color;
    
    public Sides8(int height, int base, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
    }
    
    public double getArea() {
        return 2*(1 + Math. sqrt(2))*Math.pow(base,2); 
    }
    
    public double getPerimeter() {
        return base * 8;
    }
    
    public String getColor() {
        return this.color;
    }
}