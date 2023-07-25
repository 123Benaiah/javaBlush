import java.util.*;
public class SortArr{
   public static void main(String args[]){
   Scanner in= new Scanner(System.in);
    int n=in.nextInt();
   System.out.printf("for the 'n x n' matrix; n is %d", n);
   
   System.out.println("\nenter your nxn matrix");
   double [][] arr=new double[n][n];

   for(int i=0;i<arr.length;i++)
     for(int j=0;j<arr[0].length;j++)
       arr[i][j]=in.nextDouble();
     
   sortArr(arr);
   }
   public static double[][] sortArr(double [][] arr){
        int t=arr.length;
        for(int f=1;f<=t;f++)
        for(int i=0;i<arr.length;i++){
          double b=0;
          for(int k=0;k<arr[0].length-1;k++){
            if (arr[i][k]>arr[i][k+1]){
             b=arr[i][k];
             arr[i][k]=arr[i][k+1];
             arr[i][k+1]=b;
            }
            if (f==t-1)
            System.out.print(arr[i][k]+"\t");
          } 
            if (f==t-1)
            System.out.print(arr[i][arr[0].length-1]+"\n");
        }
  return arr; 
  }
}																																																																																																																		