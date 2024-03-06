public class Main{
    public static void main(String[] args) {

        // Pet p = new Pet(); 抽象類別不能被new
        // Dog d = new Pet(); 子類別不能接父類別
        Pet p = new Dog();
        p.speak();
        p.move();

        p = new Cat();
        p.speak();
        p.move();
        
        Vehicle v = new Car();
        v.addOil();
        v.move();
        
        v= new Ship();
        v.addOil();
        v.move();
        
    }
}