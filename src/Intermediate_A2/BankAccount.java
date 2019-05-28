package Intermediate_A2;

public class BankAccount {
    private Customer customer;
    private double accountBalance;

    BankAccount(Customer customerName, double accountBalance){
        this.customer = customerName;
        this.accountBalance = accountBalance;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addMoney(double addMoney){
        this.accountBalance += addMoney;
    }

    public int calcLimit(){
        int limit = this.customer.getCreditScore()*-1000;
        return limit;
    }

    public void withdrawMoney(double removeMoney) throws BankAcccountNegativeException{
        if((this.accountBalance - removeMoney) < calcLimit()){
            throw new BankAcccountNegativeException();
        } else {
            this.accountBalance -= removeMoney;
        }
    }
}
