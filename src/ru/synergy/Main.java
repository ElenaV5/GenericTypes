package ru.synergy;

import java.util.ArrayList;
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

        //ArrayLists
        /*ArrayList numbers = new ArrayList(); //сохраняет объекты
        for(int i = 0; i < 10; i++){ //сохранять в коллекцию числа 10, 20, 30... 100
            numbers.add(i*10);
            //numbers.add(i*10.4F); //вызовит ошибку на выходе
        }
        int sum = 0;
        for(Object o : numbers){
            sum = sum + (Integer) o;
        }
        System.out.println(sum); //450
        */

        //Generics - возможность добавлять типы как параметры (к чему угодно), получаются составные типы, которые можно переиспользовать
        //Основной тип<Тип параметров>
        ArrayList<Integer> numbers = new ArrayList(); //сохраняет объекты
        for(int i = 0; i < 10; i++){ //сохранять в коллекцию числа 10, 20, 30... 100
            numbers.add(i*10);
            //numbers.add(i*10.4F); //вызовит ошибку в момент написания кода - не запустится код
        }
        //numbers.add("hi"); //тоже будет ошибка
        int sum = 0;
        for(Integer o : numbers){ //Integer вместо Object
            sum = sum + o; //здесь не нужно уточнаять, что o - Integer
        }
        System.out.println(sum); //450
    }
}