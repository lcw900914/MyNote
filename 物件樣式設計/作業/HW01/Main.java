public class Main{
    public static void main(String[] args){
        Shape x = new Rectangle(10.0,20.0);
        System.out.println("Rectangle Area is : " + x.area());
        x = new Circle(3.0);
        System.out.println("Circle Area is : " + x.area());
    }
}