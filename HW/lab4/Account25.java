package hus.oop.lab4;

public class Account25 {
    private int id;
    private Customer25 customer;
    private double balance;

    public Account25(int id, Customer25 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account25(int id, Customer25 customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer25 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer25 customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return customer + " balance=" + balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
}
