package ru.synergy;

public interface Accountable <T> {
    T getID();
    void setID(T id);
    void setSum(int sum);
    int getSum();
}
