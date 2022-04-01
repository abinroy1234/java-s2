package rectangle;

public class Rectangle 
{
    int l,b;
   
    Rectangle (int a, int c) 
    {
       l=a;
       b=c;
    }
    
 public void perimeter()
 {
    float p= 2*(l+b); 
    System.out.println(p);
 }
 
 public void area()
 {
    float a=l*b;
    System.out.println(a);
 }
   

    public static void main(String[] args) 
    {
      Rectangle perim = new Rectangle(21,36);
      perim.perimeter();
      
      Rectangle are = new Rectangle(34,45);
      are.area();
    }
}


