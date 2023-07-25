//this program promps the user to answer 5 questions and the user will be graded.
import java.util.Scanner;
public class MathQuiz{
  public static void main(String [] args){
     Scanner input=new Scanner(System.in);
//initializing variables
     int num1= (int)(Math.random()*9);
     int num2=1+(int)(Math.random()*8); 
int i= 1;
//question 1;
System.out.print("question 1:\n" + "what is "+num2+"/"+num1 + "?");
if(input.nextInt()== (int)(num2/num1))
  i=i;
else
    --i;
//question 2;
System.out.print("question 2:\n" + "what is "+num2+"+"+num1 + "?");
if(input.nextInt()==(num2+num1))
   i++;
else
    i=i;
//question 3;
System.out.print("question 3:\n" + "what is "+num2+"-"+num1 + "?");
if(input.nextInt()==(num2-num1))
   i++;
else
    i=i;
//questin 4;
System.out.print("question 4:\n" + "what is "+num2+"*"+num1 + "?");
if(input.nextInt()==(num2*num1))
   i++;
else
    i=i;
//question 5;
System.out.print("question 5:\n" + "what is "+num2+"-"+num1 + "?");
if(input.nextInt()==(num2-num1))
   ++i;
else
    i=i;
System.out.printf("%2.0f "+"your score is "+ (float)((i/6.0)*100) +"%");


  }
}