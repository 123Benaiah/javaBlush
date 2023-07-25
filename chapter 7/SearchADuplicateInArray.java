public class SearchADuplicateInArray{
    
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);

        int[] myList={2,3,4,4,2,5,4,5} ;
        int search=4;
        int a=occurences(myList,search);
        System.out.println(a);
    }
    public static int occurences(int[] myList,int search){
        int occ=0;
        for (int i = myList.length-1; i >=0; i--) 
            if (search== myList[i])
                occ++;
        return occ;
    }
}
