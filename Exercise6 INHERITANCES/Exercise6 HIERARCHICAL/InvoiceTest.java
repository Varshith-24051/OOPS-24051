class Invoice {
void generate() {
System.out.println("🧾 Invoice: Generated for order #12345");
}
}

class DigitalInvoice extends Invoice {
void emailInvoice() {
System.out.println(" Digital Invoice sent to customer@example.com");
}
}

class PrintedInvoice extends Invoice {
void printCopy() {
System.out.println(" Printed Invoice ready for packaging.");
}
}

public class InvoiceTest {
public static void main(String[] args) {
DigitalInvoice digital = new DigitalInvoice();
PrintedInvoice printed = new PrintedInvoice();

digital.generate();
digital.emailInvoice();

System.out.println();

printed.generate();
printed.printCopy();
}
}
