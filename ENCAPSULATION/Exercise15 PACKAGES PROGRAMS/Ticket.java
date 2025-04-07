package ticket;

import passenger.Passenger;

public class Ticket {
    private Passenger passenger;
    private String trainNumber;
    private double price;

    public Ticket(Passenger passenger, String trainNumber, double price) {
        this.passenger = passenger;
        this.trainNumber = trainNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("Ticket Details:");
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Age: " + passenger.getAge());
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Ticket Price: " + price);
    }
}
