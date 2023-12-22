package Java_interview;

public class DublicatElement {
    public static void main(String[] args) {
        String lang[]={"java","python","java","c","php"};
        
        for(int i=0;i<lang.length;i++){
            for(int j=i+1;j<lang.length;j++){
                if(lang[i].equals(lang[j])) {
                    System.out.println(lang[i]);
                    
                }
            }
        }
    }
    
}
