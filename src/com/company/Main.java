package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ваше сообщение: ");
        String message = sc.nextLine();

        System.out.println("Вы напечатали: " + message);

        Dog dog = new Dog();
    }
}
