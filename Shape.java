abstract class Shape {
    protected double dim1;
    protected double dim2;
    protected static final double PI = 3.14;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}
