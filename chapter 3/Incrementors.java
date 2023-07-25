import java.util.Scanner;
public class Incrementors{

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args){
        
    //generating two random numbers ;a and b
   /* int b=(int)(Math.random()*9);
    int a=(int)(Math.random()*9);
    
    //if a<b then swap a with b by b
    if (a<b){
        int c=b;
        b=a;
        a=c;
    }
    //let user try to guess the final answer
    System.out.print("what is "+a +"-"+ b +"?" +"_=");
    Scanner put= new Scanner(System.in);
    int answer=put.nextInt();
   
   
   
    
    if (a-b==answer)
        System.out.println( "you are correct"+ " the correct answer is "+(a-b));
    else
        System.out.println("you are wrong "+ "the correct answer is "+ (a-b));*/
   int x=5;
  
   boolean a=((x++)==6);//x=6 but read as 5
        System.err.println(x);
   boolean b=((++x)==6);//x is 7 read as 7
    System.err.println(x);
   boolean c= ((++x)==6);//x is 8 read as 8
   System.out.println(x);
   
  System.out.println("a = " + a);
  
     System.out.println("b = " + b);
     
     System.out.println("c = " + c);
    }
  }
