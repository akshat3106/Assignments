package assignment2;
class Deposit {
    long principal;
    int time;
    double rate;
    double total_amt;

    Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0;
        this.total_amt = 0;
    }

    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
        calc_amt();
    }

    Deposit(long principal, int time) {
        this.principal = principal;
        this.rate=5;
        this.time = time;
        calc_amt();
    }

    Deposit(long principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time=2;
        calc_amt();
    }

    void calc_amt() {
        total_amt = principal + (principal * rate * time) / 100;
    }

    void display() {
        System.out.println("principal " + principal + " rate " + rate + " years " + time + " total amount " + total_amt);
    }
}
public class question4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit(234500, 2, 7);
        Deposit d3 = new Deposit(23400, 2);
        Deposit d4 = new Deposit(3000, 4.0);
        d1.display();
        d2.display();
        d3.display();
        d4.display();
        }
    }//.