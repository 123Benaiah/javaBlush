
public class EstimateOfTution{
    
    public static void main(String[] args) {
      
      int i=10000;
        int k=1;
       while(k<11){
           i+=(i*0.05);
           k++;
        }
      int totalCost=i;
       int t=11;
       while(t<15){
         totalCost+=(totalCost*0.05);
       }
     System.out.println(" the tuition fee in ten years;"+i +" and the total tuition fee after the tenth year of 4 year worth is ;" + totalCost); 
    }  

}
