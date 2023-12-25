package Java_interview;

/**
 * SwapTwoNumber witout using third variable
 */
public class SwapTwoNumber {
    static int a=10;
    static int b=20;
    public static void main(String[] args) {
       

  // withoutThirdVariable();
   usingThirdVariable();
    }

    //     // logic 
    // public static void withoutThirdVariable(){
    //     a=a+b;
    //     b=a-b;
    //     a=a-b;

    //     System.out.println(a);
    //     System.out.println(b);
    // }

    public static void usingThirdVariable(){
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println("b is"+b);
    }
    

    
}