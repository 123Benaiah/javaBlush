import java.util.Scanner;
public class HardCoreDecToBinary{
    //this program converts a decimal number to a binary;
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
      
      System.out.print("enter you decimal number; ");
      int num=input.nextInt();
      int inputnumber=num;
//user to enter number
      String s="";
      while(num!=0){
        int b=num%2;
        char Bin=(b==0)? (char)(0+'0'):(char)(1+'0');
        s=s+Bin;
        num=num/2;//getting the whole part of entered number as an integer after dividing num by 2
      }

//read the numbers from bottom to top
      System.out.println(s +"\t is the binary number read from right to left\n OR JUST\n");
      //create an empty string to be storing some characters using for loop to reverse string
      String actualBin="";
      //initialise i_index, to be the last digit in the string
      for (int i=s.length()-1; i>=0;i--){
      actualBin+=s.charAt(i);
     //string reversed
      }
      System.out.println(actualBin+" is the number in binary for; "+inputnumber );
    }
    
    
}