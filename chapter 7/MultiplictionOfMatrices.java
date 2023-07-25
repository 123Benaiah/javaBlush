

public class MultiplictionOfMatrices {
//this program finds the multiplication of two matrices 
    public static void main(String[] args) {
       int[][] m1={{1,2,3},
                   {4,5,6}};
       int [][] m2={{10,11},
                    {20,21},
                    {30,31}};
       
       for (int i=0;i<2;i++){
           int sum=0;
          for (int j=0;j<3;j++) {
             
             sum+=m1[i][j]*m2[j][i];
          }
       System.out.print(sum+" "); 
        break;
       }
         for (int i=0;i<2;i++){
           int sum=0;
          for (int j=0;j<3;j++) {
             
             sum+=m1[i][j]*m2[j][i+1];
          }
       System.out.println(sum+" ");
       break;
       }
           for (int i=0;i<2;i++){
           int sum=0;
          for (int j=0;j<3;j++) {
             
             sum+=m1[i+1][j]*m2[j][i];
          }
       System.out.print(sum+" ");
       break;
       }  
    for (int i=0;i<2;i++){
           int sum=0;
          for (int j=0;j<3;j++) {
             
             sum+=m1[i+1][j]*m2[j][i+1];
          }
       System.out.println(sum+" ");
       break;
       }  
    }   
}
