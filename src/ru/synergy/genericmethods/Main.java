package ru.synergy.genericmethods;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Elena","Masha","Misha","Nadya","Vova","Sasha"};
        Integer[] integers = {23, 1, 5, 45, 1234, 9};
        printer.<String>print(strings);
        printer.<Integer>print(integers);
    }
}
