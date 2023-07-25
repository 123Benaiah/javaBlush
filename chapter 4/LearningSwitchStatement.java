import java.util.*;
public class LearningSwitchStatement {
    public static void main(String[] args) {
        //user enters numbers a,b to predict the answer tp the question given
        int a;
        int b;
        int c;
        a=(int)(1+ Math.random()*4);
        b=(int)(2 + Math.random()*2);
        
        System.out.println("value of a is " + a);
        
        System.out.println("value of b is "+ b);
        
        switch(a){
            case 1:
                c=a;
                a=b;
                b=c;
                System.out.println(b-a);
                break;
            case 2:
                c=a;
                a=b;
                b=c;
                System.out.println((double)(b/a));
                break;
            case 3:
                c=a;
                a=b;
                b=c;
                System.out.println(b+3*a);
                break;
//if a!=1,2,3 or 4 then default and case 4 will be worked on.
            default:
                System.out.println(";" + (b*a));
            case 4:
                c=a;
                a=b;
                b=c;
                System.out.println(b-2*b);
            
        }
        
    }
    
    
}