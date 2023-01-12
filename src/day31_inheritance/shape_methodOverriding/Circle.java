package day31_inheritance.shape_methodOverriding;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
       setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "Shape{" +
                "name='" + getName() + '\'' +
                " radius='" + radius + '\'' +
                " area='" + area() + '\'' +
                " perimeter='" + perimeter() + '\'' +
                '}';
    }

    @Override
    public void draw() {
        super.draw();
        // code fragments that can draw a circle




    }
}


