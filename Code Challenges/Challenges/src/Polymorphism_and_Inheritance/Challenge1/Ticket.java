package Polymorphism_and_Inheritance.Challenge1;

public class Ticket {
    private double price;
    private String movieName;
    private boolean dubbed;

    public Ticket(double price, String movieName, boolean dubbed) {
        this.price = price;
        this.movieName = movieName;
        this.dubbed = dubbed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isDubbed() {
        return dubbed;
    }

    public void setDubbed(boolean dubbed) {
        this.dubbed = dubbed;
    }
}
