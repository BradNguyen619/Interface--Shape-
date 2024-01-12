// thanks for letting me check suri hui
public class Sides13 implements Shape
{
    private int height;
    private int base;
    private String color;
    
    public Sides13(int height, int base, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
    }
    
    public double getArea() {
        return 1/2 * base * 13 * (base/(2*Math.tan(180/13))); 
    }
    
    public double getPerimeter() {
        return base * 13;
    }
    
    public String getColor() {
        return this.color;
    }
}