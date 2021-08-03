package Draw;

public class Triangle extends Shape{
    private double baseline;
    private double height;

    @Override
    public int getNumOfSides() {
        return 0;
    }

    @Override
    public int getArea() {
        double area = 0.5 * this.baseline * this.height;
        return (int) area;
    }
}
