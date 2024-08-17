package com.mwilson.reservationsystem;

public class Reservation {
    //attributes of class
    private String reservationNumber;
    private String accountNumber;
    private String lodgingAddress;
    private int numberOfNights;
    private int numberofBeds; //default to 2
    private int numberOfBedrooms; //default to 1
    private int numberOfBathrooms; //default to 1
    private int lodgingSize;
    private double price;
    private String status; //examples: completed, cancelled
}
