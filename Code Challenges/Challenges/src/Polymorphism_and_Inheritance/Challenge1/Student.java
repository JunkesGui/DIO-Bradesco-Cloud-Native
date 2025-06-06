package Polymorphism_and_Inheritance.Challenge1;

public class Student extends Ticket {

    public Student(double price, String movieName, boolean dubbed) {
        super(price, movieName, dubbed);
        price = price/2;
    }
}
