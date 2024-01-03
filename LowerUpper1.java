package Java_interview;

public class LowerUpper1 {
    public static void main(String[] args) {

        String a="I Am Saurabh";
        String upper="";
        String lower="";

        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
        
            if(ch>=65 && ch<=96){
              upper=  upper+ch;

            }
            else{
               lower= lower+ch;
            }
        }

       System.out.println("lower =" +lower); 
       System.out.println("upper =" +upper);
    }
    
}


