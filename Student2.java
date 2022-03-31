package student2;

/**
 *
 * @author sjcet
 */
public class Student2 {int m1,m2,m3;
public Student2(int a, int b, int c) {
this.m1 = a;
this.m2 = b;
this.m3 = c;
}
public void print()
{
System.out.println("mark of first subject "+m1);
System.out.println("mark of second subject "+m2);
System.out.println("mark of third subject "+m3);
}
public void sum()
{
int sum=m1+m2+m3;
System.out.println("sum is"+sum);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student2 s1=new Student2(10,20,30);
        Student2 s2=new Student2(50,40,30);
        s1.print();
        s1.sum();
        s2.print();
        s2.sum();
        
    
        // TODO code application logic here
    }
    
}

