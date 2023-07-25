import java.util.Scanner;
public class SumOfDig {
    
    public static void main(String[] args) {
        
       Scanner input= new Scanner(System.in);
       System.out.print("enter your number;");
       int num=input.nextInt();
       int sum=0;
       
      while(num!=0){
        sum+=num%10;
        num=num/10;
      }
    System.out.println(sum);
    }
}