package Java_interview;

public class SwapTwoString {
    public static void main(String[] args) {
        
        String a="saurabh";
        String b="tullu";

        System.out.println("before swaping "+ a);
        System.out.println("before swaping "+ b);

        //swaping 

         a=a+b;

         b=a.substring(0,a.length()-b.length());
         a=a.substring(b.length());
         System.out.println("a is "+a);
         System.out.println("b is "+b);


    }
}
