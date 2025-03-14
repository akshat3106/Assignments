package assignment2;
import java.util.Scanner;
class Student{
    int roll;
    String name;
    int DSA_marks;
    void getdata(String name,int roll,int DSA_marks){
        this.name=name;
        this.DSA_marks=DSA_marks;
        this.roll=roll;
    }
    void showData(){
        System.out.println("name "+name);
        System.out.println("roll no "+roll);
        System.out.println("dsa marks "+DSA_marks);
    }
}
public class question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student[] students=new Student[5];
        for(int i=0;i<5;i++) {
            students[i]=new Student();
        }

    }
}
