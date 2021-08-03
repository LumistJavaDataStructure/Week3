package Draw;

public class Circle extends Shape implements Comparable<Circle>{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public int getNumOfSides() {
        return 0;
    }

    @Override
    public int getArea() {
        double pi = 3.14;
        double result = pi * this.radius * this.radius;
        return (int) result;
    }

    @Override
    public int compareTo(Circle o) {
        if(this.radius == o.radius){
            return 0;
        }
        else if(this.radius > o.radius){
            return 1;
        }
        else{
            return -1;
        }
    }
}
