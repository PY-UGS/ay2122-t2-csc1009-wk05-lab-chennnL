/**
 * @author linweichen
 * 9/2/2022
 */

public class CircleFromSimpleGeometricObject extends GeometricObject {
    private double radius;
    private static final double PI = 3.141592653589793238;

    public CircleFromSimpleGeometricObject() {
        radius = 0.5;
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public void printCircle() {
        System.out.println("Circle with radius " + this.radius + super.toString());
    }
}
