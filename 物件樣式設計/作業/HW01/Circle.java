public class Circle extends Shape{
    private double radius;
    final double PI = 3.14;
    public Circle(double r){
        radius = r;
    }
    public double area(){
        return radius * radius * PI;
    }
}