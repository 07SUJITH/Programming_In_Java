//import java.sql.Date;
import java.text.spi.DateFormatProvider;
import java.util.*;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        
        dateCreated = new Date();

    
    }
    public void  withdraw (double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdraw successful  ");
            informationOfUser();              
        }
        else{
            System.out.println("Withdraw failed  ");
        }
    }
   
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit successful ");
        informationOfUser();
    }
    
    public int getId() {
        return id;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    private void informationOfUser(){

        System.out.println("Account ID: "+ getId());
        System.out.println("Balance of Account :"+ balance);
        System.out.println("annual interest rate : "+ annualInterestRate);
        System.out.println("Date of creation : "+ getDateCreated());
    }
    public void getDateCreated(Date dateCreated){
        this.dateCreated= dateCreated;
   }

}
