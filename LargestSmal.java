package Java_interview;
import java.util.Arrays;
public class LargestSmal {
    
    public static void main(String[] args) {
        int numbers[]={18,20,-11,2024};

        int small=numbers[0];
        int lerge=numbers[0];

        for(int i=0; i<numbers.length;i++){

            if (small<numbers[i]) {
                small=numbers[i];
                
            }
            else
                if (lerge>numbers[i]){
                lerge=numbers[i];
                 }


            }
        }
          System.out.printin(Arrays.toString(numbers));
    
    }
        

}


    


    
