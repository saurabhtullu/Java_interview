package Java_interview;

import java.util.Arrays;

/**
 * SecondLaregest
 */
public class SecondLaregest {
    public static void main(String[] args) {
		int nmb[]= {50,10,20,30,40,60};
		 
		int largest;
		
		for(int i=0;i<nmb.length;i++) {
	       for(int j=i+1;j<nmb.length;j++) {
	    	   if(nmb[i]<nmb[j]) {
	    		   
	    		   largest=nmb[i];
	    		   nmb[i]=nmb[j];
	    		  nmb[j]=largest;
	    		   
	    	   }
			}
					
		}System.out.println(nmb[1]);
		System.out.println(Arrays.toString(nmb));
    }
    
}