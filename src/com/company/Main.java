package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ваше сообщение: ");
        String message = sc.nextLine();

        System.out.println("Вы напечатали: " + message);

        Dog dog = new Dog(6,"Bob");
        System.out.println("Возраст собаки: "+dog.getAge()+". Имя собаки: " + dog.getName());
        Cat cat = new Cat(3,"Garfield");
        System.out.println("Имя кота: "+cat.getName()+". Возраст кота: "+ cat.getAge());

        DialogWindow dw = new DialogWindow();
    }
}
