package com.company;

import java.util.Scanner;

public class AirFlightsInternational extends AirFlights{//Производный класс «МЕЖДУНАРОДНЫЕ АВИА-РЕЙСЫ»
   private  String country;// страна
    private String departureDate;//дата отправления
    private String  arrivalDate;//дата прибытия
    AirFlightsInternational(int number, String destination, int price, String departureTime,
                            String arrivalTime, String departureDate, String arrivalDate){
        super(number, destination, price, departureTime, arrivalTime);
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;

    }
    AirFlightsInternational(){
        super();
    }
 @Override
    public void input(){
        super.input();
     Scanner in = new Scanner(System.in);
     System.out.print("страна:");
     String country = in.next();
     this.country = country;
     System.out.print("дата отправления:");
     String departureDate = in.next();
     this.departureDate = departureDate;
     System.out.print("дата прибытия:");
     String arrivalDate = in.next();
     this.arrivalDate = arrivalDate;
 }
 @Override
    public  void  output(){
        super.output();
     System.out.println("страна:"+ this.country + "\n"+ "дата отправления:"+ this.departureDate+ "\n"+
             "дата прибытия:"+ this.arrivalDate);
 }
}
