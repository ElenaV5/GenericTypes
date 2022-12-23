package ru.synergy.customgenerictypes;

public class Account implements Appendable <String> {
    private String id; //уникальный номер клиента
    private int sum; //сумма на счете

    public Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
