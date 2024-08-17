package com.mwilson.reservationsystem;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    //constant for the data directory
    private static final String DATA_DIRECTORY =
            'accounts/';

    //Map store accounts by their account number
    private Map<String, Account> accounts;

    //constructor
    public Manager() {
        this.accounts = new HashMap<>();
        loadAccounts();
    }
    //placeholder method for loading accounts from files
    private void loadAccounts() {
        //placeholder
        System.out.println("Loading accounts from directory: " + DATA_DIRECTORY);
    }
}
