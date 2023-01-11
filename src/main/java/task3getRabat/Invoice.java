package task3getRabat;

public class Invoice {

    public double getRabat(TypeOfInvoice invoiceType) {
        if (invoiceType == TypeOfInvoice.VAT) {
            return 2.58;
        } else if (invoiceType == TypeOfInvoice.ZALICZKOWA) {
            return 8.43;
        }
        return 0;
    }

}
