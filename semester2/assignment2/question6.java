package assignment2;
class Vehicle{
    String models;
    int years;
    Vehicle(String model,int year){
        this.models=model;
        this.years=years;
    }
}
class Cars extends Vehicle{
    int carId;
    double price;
    Cars(String models, int years, int carId, double price){
        super(models,years);
        this.carId=carId;
        this.price=price;
        }

    void carDisplay(){
        System.out.println(carId);
        System.out.println(years);
        System.out.println(models);
        System.out.println(price);
    }
}
public class question6 {
    public static void main(String[] args) {
        Cars car5=new Cars("toyota",1,44543,30932);
        car5.carDisplay();
    }
}
