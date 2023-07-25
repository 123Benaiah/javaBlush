import java.util.Scanner;
//This program calculates the income tax
public class ComputeZamTax {

	public static void main(String args[]){
        //access to the input console

	Scanner input=new Scanner(System.in);
	System.out.print("Enter income(salary):");


	double salary=input.nextDouble();
        //tax can be a decimal number in kwacha
        double tax;

	if(salary>=8900){
          tax=0.375*(salary-8900);
          System.out.println("The tax is k" +tax);
	}
        else if(salary>=6801){
              tax=0.3*(salary-6801);
              System.out.println("The tax is k" +tax);
	}
        else if(salary>= 4801){
              tax=0.2*(salary-4801);
              System.out.println("The tax is k" +tax);
	}
        else{
	    System.out.println("no tax charged. ");
	}
    }
}