import java.util.Scanner;
public class EnhancedDecToBinary{
    //this program converts a decimal number to a binary;
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        
        boolean f=false;
        int IntFalse=(f)? 1:0;
        boolean t=true;
        int  IntTrue=(t)? 1:0;
    
   System.out.print("enter you decimal number; ");
   int num=input.nextInt();
//user to enter number

   while(num>=2 && num>=0){
//if remainder =0 the do

         if(num%2==0)
         System.out.print(IntFalse);
         else
          System.out.print(IntTrue);
         num=num/2;//getting the whole part of entered number as an integer after dividing num by 2
         }
//if number entered is 0 or 1 then print it out
      System.out.println(num);
//read the numbers from bottom to top
      System.out.println("read from bottom to top\f");
    }
}