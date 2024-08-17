package com.mwilson.reservationsystem;
import java.util.List;
import java.util.ArrayList;

public class Account {
    //Attributes of class Account
    private String accountNumber;
    private String mailingAddress;
    private String email;
    private String phoneNumber;
    private String reservation;

    private List<Reservation> reservations;

    //Constructor
    public Account(String accountNumber, String mailingAddress, String email, String phoneNumber, String reservation) {
        this.accountNumber = accountNumber;
        this.mailingAddress = mailingAddress;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.reservation = reservation;
        this.reservations = new ArrayList<>();
    }

    /* Get and set methods */
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /* get/set mailing address*/
    public String getMailingAddress() {
        return mailingAddress;
    }
    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

        /* get/set email*/
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

        /* get/set phone number*/
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

        /* get/set reservation*/
    public String getReservation() {
        return reservation;
    }
    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    /* toString method*/
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" + "Mailing Address: " + mailingAddress + "\n" + "Email: " +
                email + "\n" + "Phone Number: " + phoneNumber + "\n" + "Reservation: " + reservation + "\n";
    }

}
