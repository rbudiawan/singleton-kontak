package org.d3ifcool.singleton;

public class DataKontak {
    private static volatile DataKontak instance = null;
    private String[][] data = {
            {"Ady", "Bandung"},
            {"Daniel", "Bogor"},
            {"Raisa", "Jakarta"},
            {"Niel", "Seoul"},
            {"Ken", "Bali"},
            {"Agung", "Lombok"},
            {"Mukhlis", "Makassar"},
    };

    private DataKontak() {}

    public String[][] getData() {
        return data;
    }

    public static DataKontak getInstance() {
        if (instance == null) {
            synchronized(DataKontak.class) {
                if (instance == null) {
                    instance = new DataKontak();
                }
            }
        }
        return instance;
    }
}
