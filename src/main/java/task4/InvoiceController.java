package task4;

public class InvoiceController {
    private Cache cache;
    private InvoiceService service;

    public InvoiceController(Cache cache, InvoiceService service) {
        this.cache = cache;
        this.service =service;
    }

    public Invoice getNewInvoice(String invoiceNumber) {
        Object data = cache.getOneData(invoiceNumber);
        if (data != null) {
            return new Invoice(invoiceNumber, data);
        } else {
            Object invoiceData = service.getInvoice(invoiceNumber);
            cache.addData(invoiceNumber, invoiceData);
            return new Invoice(invoiceNumber, invoiceData);
        }
    }
}
