package main.farmer;

import java.util.Scanner;

class Farmer
{
    float loanAmount;
    float tenure;
    float simpleInterest;
    
    static float interestRate = 9.0f;
    
    void inputFromFarmer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Farmer! Please enter the amount you need as loan: ");
        loanAmount = scan.nextFloat();
        System.out.println("Please enter the tenure of the loan: ");
        tenure = scan.nextFloat();
    }

    void calculateSimpleInterest()
    {
        simpleInterest = (loanAmount * tenure * interestRate) / 100;
    }
    void display()
    {
        System.out.println("The simple interest for the loan amount of " + loanAmount + " for the tenure of " + tenure + " years is: " + simpleInterest);
    }

    void start()
    {
        inputFromFarmer();
        calculateSimpleInterest();
        display();
    }
}
public class LoanApplication 
{
    public static void main(String[] args) 
    {
        Farmer farmer = new Farmer();
        farmer.start();

        Farmer farmer1 = new Farmer();
        farmer.start();



    }


}
