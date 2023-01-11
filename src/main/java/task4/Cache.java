package task4;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, Object> data = new HashMap<>();

    public Cache() {
    }

    public Object getOneData(String invoiceNumber) {
        return data.get(invoiceNumber);
    }

    public void addData(String invoiceNumber, Object invoiceData) {
        data.put(invoiceNumber, invoiceData);
    }

}
