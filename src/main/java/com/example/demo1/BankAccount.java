package com.example.demo1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor to initialize fields
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Getter for ownerName
    public String getOwnerName() {
        return this.ownerName;
    }

    // Getter for balance
    public double getBalance() {
        return this.balance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Setter for balance (not recommended to use directly)
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Setter for ownerName
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount >0){
            System.out.println(getBalance() + amount);
        }else System.out.println("you mast be enter number upter then 0 ");
    }
    public double withraw(double amount) {
        if (getBalance()<0){
            System.out.println("your Blance muste be ");
            return  amount;
        }else if (amount > getBalance()){
            System.out.println("kas dkl chi montent kbr srg nm hadak chi li 3ndk f compte ");
            return  amount;
        }
        else{
            return getBalance() - amount;
        }

    }



    public static void main(String[] args) {
        BankAccount myConnt =  new  BankAccount("1232444","saber", 430);
        myConnt.deposit(33);
        System.out.println(myConnt.withraw(44));

    }

}

