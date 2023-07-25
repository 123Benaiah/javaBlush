
import java.util.Scanner;
public class Dec2Hex{
   //this program promps the user to enter a decimal which will be converted to a hexadecimal value.
  public static void main(String [] args){
     Scanner input=new Scanner(System.in);
//initializing variables
     System.out.print("enter your decimal digit;");

     int num=input.nextInt();
//declare a string
     String hex=" ";
     char hexValue;
     while(num!=0){
         int b=num%16;
//changing a decimal remainder to hexadecimal value as a string
         //char hexValue=(b<=9 && b>=0)? (char)(b+'0'): (char)(b-10+'A');
if (b>=0 && b<=9)
 hexValue= (char)(b+'0') ;
else
 hexValue=(char)(b-10+'A');

//concatinating the strings
         hex=hexValue+hex;// adding a character to a string from the left hand side of hex
         num=(num/16);
        }
       System.out.println("your hexadecimal value; "+ hex);
     
     }


  }
