package ru.synergy.customgenerictypes;

public class Account <T> {
    private T id; //уникальный номер клиента
    private int sum; //сумма на счете

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
