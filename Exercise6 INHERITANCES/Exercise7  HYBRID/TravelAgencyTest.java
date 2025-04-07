interface Bookable {
void bookTrip(String destination);
}

interface Refundable {
void cancelBooking(String reason);
}

class Agency {
void showPackages() {
System.out.println(" Welcome to WanderLuxe Travel Agency!");
System.out.println(" Popular Packages: Maldives, Switzerland, Bali");
}
}

class LuxuryTravel extends Agency implements Bookable, Refundable {
public void bookTrip(String destination) {
System.out.println(" Booking trip to: " + destination + " with luxury amenities.");
}

public void cancelBooking(String reason) {
System.out.println(" Booking canceled. Reason: " + reason);
System.out.println(" Refund initiated (Terms & Conditions apply).");
}
}

class UltraLuxuryTravel extends LuxuryTravel {
void offerConciergeService() {
System.out.println(" Personal Concierge Assigned. 24/7 assistance during your trip.");
}
}

public class TravelAgencyTest {
public static void main(String[] args) {
UltraLuxuryTravel trip = new UltraLuxuryTravel();
trip.showPackages();                    
       trip.bookTrip("Tokyo, Japan");                 
trip.cancelBooking("Change in travel plans"); 
 trip.offerConciergeService();                   }
}
