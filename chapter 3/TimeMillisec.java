import java.util.Scanner;
public class TimeMillisec {
  public static void main(String argv[]) {
    System.out.print("Enter minutes(v)= ");
    Scanner inputMinutes= new Scanner(System.in);
    int v= inputMinutes.nextInt();
    //assign seconds to ......
    int seconds=(int)v*60;
    int milliSeconds2=seconds*60;
    int FINAL_SECONDS=milliSeconds2;
    System.out.println(FINAL_SECONDS + " milliseconds");
  }
}
      