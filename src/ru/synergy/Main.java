package ru.synergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Object o = new Scanner(System.in);
        System.out.println(o instanceof Scanner); //проверка объекта
        Scanner scanner = null;

        if(o instanceof Scanner) scanner = (Scanner) o; //проверка обязательна

        //((Scanner) o ).nextInt(); //преобразовывает в инт, если нет, то получим ошибки в консоли
        if(scanner != null) {
            scanner.nextInt();
        }

        Object o1 = new String();
        Object o2 = new Boolean(true);

    }
}