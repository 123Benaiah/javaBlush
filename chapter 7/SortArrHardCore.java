//this program also shows how an array can be printed out and how an array can be sorted using 2 methods.ie ;using a predefined function and using the method made.
import java.util.Scanner;
import java.util.Arrays;
public class SortArrHardCore {
    //sort arrays in java hardcore
    public static void main(String[] args) {
       Scanner in=new Scanner (System.in);
       System.out.print("enter your 6 integers;");
        int [] arrNum=new int[6];
        for (int j=0;j<6;j++){
          arrNum[j]=in.nextInt();
        }
    Arrays.sort(arrNum);
    //sorti(arrNum);
    
    System.out.println(Arrays.toString(arrNum));
    print(arrNum);
   }
    public static int[] sorti(int[] arr){
        for (int j=0;j<5;j++){
          int temp=0;
          for(int i=0;i<5;i++)
              if(arr[i]>arr[i+1]){
                  temp=arr[i];
                  arr[i]=arr[i+1];
                  arr[i+1]=temp;
              }
        }
     return arr;   
    }
  public static void print(int []arr){
      System.out.print("your sorted list is;");
      for(int i=0;i<6;i++){
          int count=0;
          for (int j=i+1;j<6;j++){
              if(arr[i]==arr[j])
                  count++;
                 }
          if(count==0)
           System.out.print(arr[i]+" ");
      }
      
  }
}
