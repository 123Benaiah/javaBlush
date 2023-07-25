
public class Methods {
  public static void main(String[] args) {
  byte a= 4;
  byte b=7;
  byte x=4,z=10;
  sample(a,b);
  sample(x,z);
  sample(4,5);
  sample(b);
  System.out.println("sample a has reuturned " +sample(a,b));
  System.out.println("sample b has reuturned " +sample(x,z));
  } 
  public static byte sample(byte d,byte y){
  byte sum=0;
  sum+=d+y;
  byte net=sum;
  sum=d;
  d=y;
  y=net;
  return y;
  }
  public static byte sample(byte d,int y){
    byte sum=0;
    sum+=d+y;
    return sum;
  }
   public static int sample(int d,int y){
    byte sum=0;
    sum+=d+y;
    return sum;
  }
   public static void sample(int a){
     if(a==7) { 
   System.out.println("void sample  has reuturned has returned nothing");
     }else
   System.out.println("sample a has returned");
   }
}
