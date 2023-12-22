package Java_interview;

public class MissingNum {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7};
        int b=0;
      for(int i=0;i<a.length;i++){
        b=b+a[i];
      }
      
      int c=0;
      for(int j=0;j<=7;j++){
        c=c+j;

      }
      System.out.println("Missing nmb is::"+ (c-b));
    }
    
}
