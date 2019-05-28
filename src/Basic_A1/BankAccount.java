package Basic_A1;

public class BankAccount {

    private int accountNumber;
    private String name;
    private String lastName;

    private static int count = 0;

    public BankAccount (int accountNumber, String name, String lastName){
        this.accountNumber = accountNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public void setAccountNumber( int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber (){
       return this.accountNumber;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLastName( String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }
}

