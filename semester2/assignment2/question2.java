package assignment2;

class complex {
    int real;
    int imag;
    void setData(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    void display(){
        System.out.println(real+"+"+imag+"i");
    }
    public complex add(complex num1, complex num2){
        complex num3=new complex();
        num3.real=num1.real+num2.real;
        num3.imag=num1.imag+num2.imag;
        return num3;
    }
}
public class question2{
    public static void main(String[] args) {
        complex num1=new complex();
        complex num2= new complex();
        num1.setData(3,4);
        num2.setData(4,5);
        System.out.println("first complex number ");
        num1.display();
        System.out.println("second complex number");
        num2.display();
        complex num3=new complex();
        num3=num3.add(num1,num2);
        System.out.println("resulting complex number");
        num3.display();
    }
}