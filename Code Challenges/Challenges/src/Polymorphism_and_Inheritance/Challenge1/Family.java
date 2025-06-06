package Polymorphism_and_Inheritance.Challenge1;

public class Family extends Ticket{
    int familyMembers;

    public Family(double price, String movieName, boolean dubbed) {
        super(price, movieName, dubbed);
    }

}
