import  java.util.Scanner;
public class Account {
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name=name;
        if (balance >0.0){
            this.balance=balance;
        }

    }
    void  deposit(double depositAmount){
        if (depositAmount>0.0){
            balance=balance+depositAmount;
        }
    }
    double getBalance(){

        return balance;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return  name;
    }

}