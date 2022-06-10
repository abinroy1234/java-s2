package factorial;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,fact=1;
        Scanner d=new Scanner(System.in);
        System.out.println("enter the value:\n");
        n=d.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            
        }
        System.out.println("factorial is "+fact);
        }
        
        // TODO code application logic here
    }