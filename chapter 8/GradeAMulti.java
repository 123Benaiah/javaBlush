
public class GradeAMulti {
   public static void main (String [] args){
        // grading a multiple choice test
       //score of student
   char [][]arr={
           {'A','B','A','C','C','D','E','E','A','D'},
           {'D','B','A','B','C','A','E','E','A','D'},
           {'E','D','D','C','C','D','E','E','A','D'},
           {'A','B','B','C','C','D','E','E','A','D'},
           {'E','B','A','C','C','D','E','E','A','D'},
           {'D','B','A','C','C','D','E','E','A','D'},
           {'A','B','A','C','B','D','E','E','A','D'},
           {'C','B','A','C','C','D','E','E','A','D'},
           {'A','B','A','C','C','D','E','E','A','D'},
           {'D','B','A','C','C','D','E','E','A','D'},
           {'C','B','E','C','C','D','E','E','A','D'}
           };
        char [] ar={'D','B','D','C','C','D','A','E','A','D'};
      for(int row=1;row<arr.length; row++){
         int truecount=0;
          for (int col=0;col<arr[0].length;col++)
              if(arr[row][col]==ar[col])
                  truecount++;
           System.out.println("the student "+row+" has  scored;"+truecount+ " out of ten");
      }  
  }
}