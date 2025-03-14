package assignment2;
class Shapes {
    String color;
    Shapes(String color){
        this.color=color;
    }
}
class Circles extends Shapes{
    double radiuss;
    Circles(String color,double radiuss){
        super(color);
        this.radiuss=radiuss;
    }
    double area(){
        return Math.PI*radiuss*radiuss;
    }
}
class Rectangle extends Shapes{
    double length;
    double width;
    Rectangle(String color ,double length,double width ){
        super(color);
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
}
public class question7 {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle("yellow",4.5,54.5);
        Circles circle1=new Circles("blue",5);
        System.out.println(circle1.area());
        System.out.println(rectangle1.area());

    }
}
