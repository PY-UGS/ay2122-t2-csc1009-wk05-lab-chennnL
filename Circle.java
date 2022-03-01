/**
 * @author linweichen
 * 9/2/2022
 */

public class Circle extends Shape {
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Circle.");
        return Math.round(PI * dim1 * dim2 * 10.0) / 10.0;
    }
}
