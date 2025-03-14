package assignment2;
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable{
    String name;
    Duck(String name){
        this.name=name;
    }
    @Override
    public void fly() {
        System.out.println(name+" is flying");

    }

    @Override
    public void swim() {
        System.out.println(name+" is swimming");
    }
    void displayDetails(){
        System.out.println("duck's name "+name);
        System.out.println("abilities: ");
        fly();
        swim();
    }
}
public class question8 {
    public static void main(String[] args) {
        Duck duck1=new Duck("akshat");
        duck1.fly();
        duck1.swim();
        duck1.displayDetails();

    }
}
