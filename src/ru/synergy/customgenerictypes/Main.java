package ru.synergy.customgenerictypes;

public class Main {
    public static void main(String[] args){
    Account<Integer> acc1 = new Account(1234, 5000);
    System.out.println(acc1.getId());

    Account<String> acc2 = new Account("sid472", 4700); //вызовет ошибку в консоли
    System.out.println(acc2.getId());

    int a = acc1.getId() + 10; // опасное преобразование типов
        System.out.println(a);

    Account<Integer> acc3 = new Account(13000, 100, "Something" );    //параметризация через конструктор

    }
}
