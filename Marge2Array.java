package Java_interview;

import java.util.Arrays;

/**
 * Marge2Array in assending order
 */
public class Marge2Array {
    public static void main(String[] args) {
        int a[]={10,50,20,89};
        int b[]={1,3,2,7,5,4};
        int c[]=new int[a.length+b.length];
        for(int  i=0;i<a.length;i++){
            c[i]=a[i];
            for(int j=0;j<b.length;j++){
                c[i+a.length]=b[j];
            }
        }
        System.out.println(Arrays.toString(c));
    }

    
}