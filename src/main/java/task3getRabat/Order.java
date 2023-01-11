package task3getRabat;

public class Order {
    RecipientOfDocument recipientOfDocument;

    public double getRabat() {
        int age = recipientOfDocument.getAge();
        if (age < 25) {
            return 0;
        } else if (age < 50) {
            return 20;
        } else {
            return 50;
        }
    }
}
