import java.util.Scanner;

class TicketBooking {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int availableSeats = 5;

System.out.print("How many seats would you like to book? ");
int request = scanner.nextInt();

try {
if (request <= 0) {
throw new IllegalArgumentException("Request must be greater than 0.");
}
if (request > availableSeats) {
throw new Exception("Only " + availableSeats + " seats available.");
}
availableSeats -= request;
System.out.println("Booking successful. Seats remaining: " + availableSeats);
} catch (IllegalArgumentException e) {
System.out.println("Input Error: " + e.getMessage());
} catch (Exception e) {
System.out.println("Booking Error: " + e.getMessage());
}
}
}
