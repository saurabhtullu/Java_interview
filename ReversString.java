package Java_interview;

public class ReversString {
    public static void main(String[] args) {
        String s="saurabh";

    // 1. using for loop
    int len=s.length();
    String rev="";

    for(int i=len-1;i>=0;i--){
        rev=rev+s.charAt(i);
    
    }
    System.out.println(rev);


   //2.using StringBuffer class


    StringBuffer sb=new StringBuffer(s);
    System.out.println(sb.reverse());
}
}
   // output--hbaruas
          //    hbaruas