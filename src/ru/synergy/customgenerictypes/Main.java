package ru.synergy.customgenerictypes;

public class Main {
    public static void main(String[] args){
    Account acc1 = new Account(1234, 5000);
    System.out.println(acc1.getId());

    Account acc2 = new Account("sid472", 4700); //вызовет ошибку в консоли
    System.out.println(acc2.getId());

    int a = ((Integer) acc2.getId()) + 10;
        System.out.println(a);

    }
}
