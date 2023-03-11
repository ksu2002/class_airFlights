package com.company;

/*
Задание:  Разработать консольную программу на языке Java, в которой необходимо определить базовый класс
 и на его основе производные классы. Кроме закрытых полей с данными в классах должны быть методы доступа,
 конструкторы с параметрами, также методы в соответствии с индивидуальным вариантом задачи.
 С использованием массива ссылок на базовый класс создать массив объектов производных классов и организовать работу с ним.
 В программе необходимо продемонстрировать механизм динамического полиморфизма.

Базовый класс «АВИА-РЕЙСЫ» описывает следующие данные-элементы: номер рейса;
пункт назначения; цена билета; время отправления; время прибытия на конечный пункт.
Производный класс «АВИА-РЕЙСЫ ПО СТРАНЕ» содержит следующие данные: дни вылета.
Производный класс «МЕЖДУНАРОДНЫЕ АВИА-РЕЙСЫ» содержит: страна, дата отправления и дата прибытия.
Организовать ввод/вывод  информации об авua  рейсах.
Вывести информацию о рейсах, отправляющихся в указанный пункт назначения
 */


import java.util.Scanner;

public class AirFlights implements Information {//Базовый класс «АВИА-РЕЙСЫ»
    private int number;//номер рейса
    private String destination;//пункт назначения
    private int price;//цена билета
    private String departureTime;//время отправления
    private String arrivalTime;//время прибытия на конечный пункт

    AirFlights() {
    }

    AirFlights(int number, String destination, int price, String departureTime, String arrivalTime) {
        this.number = number;
        this.destination = destination;
        this.price = price;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getDestination() {
        return destination;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите");
        System.out.print("номер рейса:");
        String number = in.next();
        while (!number.matches("^-?\\d+$")) {
            System.out.print("ошибка ввода, введите целое число!");
            number = in.next();
        }
        System.out.print("пункт назначения:");
        String destination = in.next();
        System.out.print("цена билета:");
        String price = in.next();
        while (!price.matches("^-?\\d+$")) {
            System.out.print("ошибка ввода, введите целое число!");
            price = in.next();
        }
        System.out.print("время отправления:");
        String departureTime = in.next();
        System.out.print("время прибытия на конечный пункт:");
        String arrivalTime = in.next();
        this.number = Integer.parseInt(number);
        this.destination = destination;
        this.price = Integer.parseInt(price);
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public void output() {
        System.out.println("номер рейса:" + this.number + "\n" + "пункт назначения:" + this.destination + "\n" +
                "цена билета:" + this.price + "\n" + "время отправления:" + this.departureTime
                + "\n" + "время прибытия на конечный пункт:" + this.arrivalTime);

    }

}
