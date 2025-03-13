import java.util.Scanner;

import static java.lang.System.exit;

class ATM{
    float Balance;
    int Pin=2408;

    public void checkPin(){
        System.out.println("Enter your Pin: ");
        Scanner sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(enteredPin==Pin){
            menu();
        }
        else{
            System.out.println("Enter Valid Pin");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();

        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            withdrawMoney();
        }
        else if(choice==3){
            depositMoney();
        }
        else if(choice==4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice");
            menu();
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float choice=sc.nextFloat();
        if(choice>Balance){
            System.out.println("Insufficient Balance. Enter valid Amount");
        }
        else{
            System.out.println("Money Withdrawn Successfully");
            Balance-=choice;
            checkBalance();
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter Amount to be deposited: ");
        Scanner sc=new Scanner(System.in);
        float choice=sc.nextFloat();
        Balance+=choice;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class Main {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkPin();
    }
}