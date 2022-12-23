package ru.synergy.customgenerictypes;

import ru.synergy.Accountable;

public class Account<T> implements Accountable<T> {
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

    @Override
    public T getID() {
        return null;
    }

    @Override
    public void setID(T id) {

    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
