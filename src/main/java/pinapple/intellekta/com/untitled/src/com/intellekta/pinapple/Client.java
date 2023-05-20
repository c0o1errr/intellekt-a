package com.intellekta.pinapple;

public class Client {
    long id;
    String type;
    String name;
    double sum;

    public Client() {
    }

    public Client(long id, String type, String name, double sum) {
        if (id < 100_000_000_000L) {
            id = 100_000_000_000L;
        }
        if (!type.equals("institution") && !type.equals("individual")) {
            type = "institution";
        }
        if (sum < 0) {
            sum = 0;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
