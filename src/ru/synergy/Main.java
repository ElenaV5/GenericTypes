package ru.synergy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
/*        Object o = new Scanner(System.in);
        System.out.println(o instanceof Scanner); //проверка объекта
        Scanner scanner = null;

        if(o instanceof Scanner) scanner = (Scanner) o; //проверка обязательна

        //((Scanner) o ).nextInt(); //преобразовывает в инт, если нет, то получим ошибки в консоли
        if(scanner != null) {
            scanner.nextInt();
        }

        Object o1 = new String();
        Object o2 = new Boolean(true);*/


        //Второй пример
        Object[] objects = {10, "Привет", 3.14}; //автоупаковка
        for(Object o : objects){ //перебираем все объекты
            if(o instanceof String){ //является ли объект Стринг
                String s = (String) o; //преобразовываем в стринг
                System.out.println(s); //Привет
            }
        }



    }
}