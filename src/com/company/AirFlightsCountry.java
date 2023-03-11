package com.company;

import java.util.Scanner;

public class AirFlightsCountry extends AirFlights {//Производный класс «АВИА-РЕЙСЫ ПО СТРАНЕ»
    private String departureDay;//день вылета

    AirFlightsCountry(int number, String destination, int price, String departureTime, String arrivalTime, String departureDay) {
        super(number, destination, price, departureTime, arrivalTime);
        this.departureDay = departureDay;
    }

    AirFlightsCountry() {
        super();
    }

    @Override
    public void input() {
        super.input();
        Scanner in = new Scanner(System.in);
        System.out.print("день вылета:");
        String departureDay = in.next();
        this.departureDay = departureDay;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("день вылета:" + this.departureDay);
    }

}
