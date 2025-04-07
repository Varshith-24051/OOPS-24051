class Delivery {
    String orderId;
    String destination;

    Delivery(String orderId, String destination) {
        this.orderId = orderId;
        this.destination = destination;
    }

    void processDelivery() {
        System.out.println("Processing delivery for Order ID: " + orderId + " to " + destination);
    }
}

class StandardDelivery extends Delivery {
    StandardDelivery(String orderId, String destination) {
        super(orderId, destination);
    }

    @Override
    void processDelivery() {
        System.out.println("Processing standard delivery for Order ID: " + orderId + " to " + destination + ". Estimated time: 5-7 days.");
    }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(String orderId, String destination) {
        super(orderId, destination);
    }

    @Override
    void processDelivery() {
        System.out.println("Processing express delivery for Order ID: " + orderId + " to " + destination + ". Estimated time: 1-2 days.");
    }
}

class SameDayDelivery extends Delivery {
    SameDayDelivery(String orderId, String destination) {
        super(orderId, destination);
    }

    @Override
    void processDelivery() {
        System.out.println("Processing same-day delivery for Order ID: " + orderId + " to " + destination + ". Estimated time: Same day.");
    }
}

public class OnlineDeliverySystem {
    public static void main(String[] args) {
        Delivery delivery1 = new StandardDelivery("ORD123", "New York");
        Delivery delivery2 = new ExpressDelivery("ORD456", "Los Angeles");
        Delivery delivery3 = new SameDayDelivery("ORD789", "Chicago");

        delivery1.processDelivery();
        delivery2.processDelivery();
        delivery3.processDelivery();

        Delivery polymorphicDelivery = new SameDayDelivery("ORD999", "San Francisco");
        polymorphicDelivery.processDelivery();
    }
}
