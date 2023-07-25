import java.util.Scanner;

public class TheCalculator {

   public static void main (String [] args){
     
     Scanner input= new Scanner(System.in);     
     System.out.print("Enter first number; ");
     double number1=input.nextDouble;
     System.out.print("Enter second number; ");
     double number2=input.nextDouble;
     double sum= number1+number2;
     double quotient= number1/number2;
     double product= number1*number2;
     double difference= number1-number2;
     double answer= sum,quotient,product,difference;
     
     if(answer==sum)
      System.out.println("sum is" + sum);
     else if(answer==quotient)
      System.out.println("quotient is " + quotient);
     else if(answer==product)
      System.out.println("product is " + product);
     else if(answer==difference)
      System.out.println("difference is " + difference);
     else
      System.out.println("wrong math ");
   }
}