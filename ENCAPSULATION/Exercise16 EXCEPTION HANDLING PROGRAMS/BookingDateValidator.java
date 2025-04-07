import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class BookingDateValidator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter booking date (YYYY-MM-DD): ");
String input = scanner.nextLine();

try {
LocalDate bookingDate = LocalDate.parse(input);
LocalDate today = LocalDate.now();

if (bookingDate.isBefore(today)) {
throw new Exception("You cannot book for a past date.");
}
System.out.println("Booking date is valid.");
} catch (DateTimeParseException e) {
System.out.println("Date format is invalid.");
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}
