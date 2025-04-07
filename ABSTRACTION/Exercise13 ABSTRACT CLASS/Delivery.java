interface DeliveryStep {
void proceed();
}

class PickedUp implements DeliveryStep {
public void proceed() {
System.out.println(" Parcel has been picked up from the sender.");
}
}

class InTransit implements DeliveryStep {
public void proceed() {
System.out.println(" Parcel is on the way to the destination.");
}
}

class Delivered implements DeliveryStep {
public void proceed() {
System.out.println(" Parcel has been delivered successfully!");
}
}

public class Delivery {
public static void main(String[] args) {
DeliveryStep step1 = new PickedUp();
DeliveryStep step2 = new InTransit();
DeliveryStep step3 = new Delivered();

step1.proceed();
step2.proceed();
step3.proceed();
}
}
