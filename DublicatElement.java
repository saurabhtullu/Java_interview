package Java_interview;

import java.util.HashSet;
import java.util.Set;

public class DublicatElement {
    public static void main(String[] args) {
        String lang[]={"java","python","java","c","php"};

        //1. using for loop wast soluation
        for(int i=0;i<lang.length;i++){
            for(int j=i+1;j<lang.length;j++){
                if(lang[i].equals(lang[j])) {
                    System.out.println(lang[i]);
                    
                }
            }
        }

        System.out.println("**********************");
        //2.  Using HashSet java collection : it store unique value
        Set<String> store= new HashSet<String>();
        for(String name:lang){
            if(store.add(name)==false){
                System.out.println(name);
            }
        
        }


    }
    
}
