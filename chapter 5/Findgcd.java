
import java.util.Scanner;
// this program finds the gcd of two numbers the hard way
public class Findgcd {

    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       //promp the user to enter two numbers
       // enter your first number
       System.out.print("enter your first number;");
       int a=input.nextInt();
       //enter your second number
       System.out.print("enter your second number;");
       int b=input.nextInt();
       int c=1;
       int i=1;
       while((i<=a)&&(i<=b)){
           if ((a%i==0)&&(b%i==0))
               c=i;
           else
               i=i;
           i++;
       }
       System.out.printf("%d is the gcd of %d and %d ", c,a,b);
       
    }
    
}
