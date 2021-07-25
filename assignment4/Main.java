package assignment4;

import java.util.Scanner;
interface Loan{
    float rateOfInterest=(float)10.5;
    public abstract double emi(double amount);
}
class HomeLoan implements Loan{
	public double emi(double amount){
        return amount*this.rateOfInterest/100;
    }
}
class CarLoan implements Loan{
	public double emi(double amount){
        return amount*this.rateOfInterest/100;
    }
}
class EducationLoan implements Loan{
	public double emi(double amount){
        return amount*this.rateOfInterest/100;
    }
}

public class Main{  
  public static void main(String[] args) 
  {
      Scanner sc=new Scanner(System.in);
      Loan obj1=new HomeLoan();
      Loan obj2=new HomeLoan();
      Loan obj3=new HomeLoan();
      System.out.println("Enter the amount: ");
      double amount=sc.nextDouble();
      System.out.println("The emi for HomeLoan is: ");
      System.out.println((int)(obj1.emi(amount)));
      System.out.println("The emi for CarLoan is: ");
      System.out.println((int)(obj2.emi(amount)));
      System.out.println("The emi for EducationLoan is: ");
      System.out.println((int)(obj3.emi(amount)));
      
  }
}  

