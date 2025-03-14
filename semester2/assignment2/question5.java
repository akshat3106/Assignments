package assignment2;

abstract class Shape{
    abstract double calculateArea();
}
class Square extends Shape {
    double side;
    Square(double side){
        this.side=side;
    }
    @Override
    double calculateArea() {
        return side*side;
    }
}
class Triangle extends Shape {
    double base;
    double height;
    Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    @Override
    double calculateArea() {
        return 0.5*base*height;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double calculateArea() {
        return Math.PI *radius*radius;
    }
}
public class question5{
    public static void main(String[] args){
        Shape square1=new Square(3.5);
        Shape circle1=new Circle(6.5);
        Shape triangle1=new Triangle(3,4);
        System.out.println(square1.calculateArea());
        System.out.println(circle1.calculateArea());
        System.out.println(triangle1.calculateArea());
    }
}
