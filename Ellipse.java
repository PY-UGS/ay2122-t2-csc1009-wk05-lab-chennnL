/**
 * @author linweichen
 * 9/2/2022
 */

public class Ellipse extends Shape {

    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("Inside Area for Ellipse.");
        return Math.round((PI * this.dim1 * this.dim2) * 100.0) / 100.0;
    }
}
