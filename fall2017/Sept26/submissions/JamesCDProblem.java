
package cdsellers;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author James
 * @version 0.1
 */
public class CDSellers {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);
        String[] info = scanThis.nextLine().split("\\s+");
        int cdsToSell = 0;
        int[] jack = new int[Integer.parseInt(info[0])];
        for(int counter=0;counter<Integer.parseInt(info[0])+Integer.parseInt(info[1]);counter++){
            if (counter < Integer.parseInt(info[0])){
                jack[counter]=Integer.parseInt(scanThis.nextLine());
            }else{
                int someInt = Integer.parseInt(scanThis.nextLine());
                if(IntStream.of(jack).anyMatch(num->num==someInt)){
                    cdsToSell++;
                }
            }
        }
        System.out.println(cdsToSell+"");
    }
}
