package Java_interview;

public class LowerUpper {
    public static void main(String[] args) {

        String a="I Am Saurabh";
        int upper=0;
        int lower=0;

        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
        
            if(ch>=65 && ch<=96){
                upper++;

            }
            else{
                lower++;
            }
        }

       System.out.println("lower =" +lower); 
       System.out.println("upper =" +upper);
    }
    
}
