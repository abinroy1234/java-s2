package largest;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner n=new Scanner(System.in);
        System.out.println("enter the  value");
        a=n.nextInt();
        System.out.println("enter the  value");
        b=n.nextInt();
        System.out.println("enter the  value");
        c=n.nextInt();
        if(a>b && a>c)
            System.out.println(+a+" is the largest");
        else if(b>a && b>c)
            System.out.println(+b+" is the largest");
        else
            System.out.println(+c+" is the largest");
        
        // TODO code application logic here
    }
    
}