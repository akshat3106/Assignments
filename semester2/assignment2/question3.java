package assignment2;

class Book {
    int bookId;
    int price;
    int quan_tity;
    static int totalAmount;
    Book(int bookId,int price, int quan_tity){
        this.price=price;
        this.bookId=bookId;
        this.quan_tity=quan_tity;
    }
    void displayDetails(){
        System.out.println("bookid "+bookId+" price "+price +" quantity "+ quan_tity);
    }
    int totalcost(){
        return price*quan_tity;
    }

    public static void main(String[] args) {
        Book book1=new Book(121,120,1);
        Book book2=new Book(122,23,3);
        Book book3=new Book(123,223,2);
        Book book4=new Book(124,2334,1);
        Book book5=new Book(125,236,3);
        System.out.println("book details");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();
        totalAmount=book1.totalcost()+ book2.totalcost()+book3.totalcost()+book4.totalcost()+ book5.totalcost();
        System.out.println("total cost of the book "+totalAmount);
    }
}
