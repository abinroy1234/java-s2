package calculator;
import java.util.Scanner;
public class Calculator{
    
    void sum(int a,int b)
    {
        System.out.println("sum is"+(a+b));
    }
    void sum(float a, float b)
    {
        System.out.println("sum is"+(a+b));
    }
    public static void main(String[] args) 
    {
        int a,b;
        float c,d;
        Scanner n=new Scanner(System.in);
    Calculator  cal = new Calculator();
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
    
    
}
