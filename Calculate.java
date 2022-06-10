package calculate;
import java.util.Scanner;
public class Calculate{
    void sum(int a,int b)
    {System.out.println("sum is"+(a+b));
    }
    void sum(float a, float b)
    {
        System.out.println("sum is"+(a+b));
    }
    public static void main(String[] args) {
        int a,b;
        float c,d;
        Scanner n=new Scanner(System.in);
    Calculate  cal = new Calculate();
    System.out.println("enter the value");
    a=n.nextInt();
    System.out.println("enter the value");
    b=n.nextInt();
    
    System.out.println("enter the value"); 
    c=n.nextFloat();
    System.out.println("enter the value");
    d=n.nextFloat();
    cal.sum (a, b);
    cal.sum(c, d);
    }
    
    
