package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car();
        obj1.new CarEngine();

        new Car.StaticInnerClass();




    }
}
