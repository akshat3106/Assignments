package assignment2;
import java.util.Scanner;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employe extends Person{
    int Eid;
    double salaryy;
    Employe(String name,int age, int Eid, double salaryy){
        super(name,age);
        this.Eid=Eid;
        this.salaryy=salaryy;
    }
    void display(){
        System.out.println("name of the employee: "+ name);
        System.out.println("age of the employee: "+age);
        System.out.println("salary of the employee: "+salaryy);
        System.out.println("employe id: "+Eid);
    }
}
public class question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee name: ");
        String name=sc.nextLine();
        System.out.println("enter the age of the employee: ");
        int age=sc.nextInt();
        System.out.println("enter the salary of the employee: ");
        double salaryy=sc.nextDouble();
        System.out.println("enter the employee of the employee: ");
        int eid=sc.nextInt();
        Employe emp=new Employe(name,age,eid,salaryy);
        emp.display();

    }
}
