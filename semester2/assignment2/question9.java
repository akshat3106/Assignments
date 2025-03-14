package assignment2;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    void displayEmployeeInfo(){
        System.out.println("the name of the employee is "+name);
        System.out.println("the salary of "+name +" is "+salary);
    }
}
class Manager extends Employee{
    String department;
    Manager(String name,int salary,String department){
        super(name,salary);
        this.department=department;
    }
    void displayMangerInfo(){
        super.displayEmployeeInfo();
        System.out.println("Department "+department);
    }
}
public class question9 {
    public static void main(String[] args) {
        Manager manager1=new Manager("Akshat",10000,"developer");
        manager1.displayMangerInfo();
    }
}
