package com.mwilson.reservationsystem;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("A123456789", "123 " +
                "Elm St", "peabody@example.com", "123" +
                "-4567", "hotel");
        System.out.println(account);
    }
}
