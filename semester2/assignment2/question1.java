package assignment2;

import java.util.Scanner;

class Car {
    String model;
    int year;
    void setDetails(String model,int year){
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("car model "+model+" year "+year);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car carA=new Car();
        carA.setDetails("Toyota",2020);
        System.out.println("enter the car model");
        String model1=sc.nextLine();
        System.out.println("enter the year of the car");
        int year2=sc.nextInt();
        Car carB=new Car();
        carB.setDetails(model1,year2);
        System.out.println("car 1");
        carA.displayDetails();
        System.out.println("car 2");
        carB.displayDetails();
        if(carA.year>carB.year){
            System.out.println("car 1 is newer");
        } else {
            System.out.println("car 2 is newer");
        }


    }

}
