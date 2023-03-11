package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AirFlights airFlights[] = new AirFlights[2];

        airFlights[0] = new AirFlightsCountry();
        airFlights[0].input();

        airFlights[1] = new AirFlightsInternational();
        airFlights[1].input();

        System.out.println("Введите пункт назначения ");
        Scanner in = new Scanner(System.in);
        String destination = in.next();
        for (int i = 0; i < airFlights.length; i++) {
            if (airFlights[i].getDestination().equals(destination)) {
                airFlights[i].output();
            }
        }

    }
}
