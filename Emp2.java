/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emp2;
public class Emp2
{
    int emp_id;
    String ename;
    float salary;
    float ts;
    Emp2(int a,String b,float c){
        emp_id=a;
        ename=b;
        salary=c;
        }
    public void totalsalary()
    {
        float ts=(salary+salary*(20/100));
        System.out.println("total salary is "+ts);
    }
    public static void main(String[] args)
        {
           Emp2 empx=new Emp2(101,"abin",1000);
           empx.totalsalary();
            Emp2 empy=new Emp2(102,"alan",2000);
            empy.totalsalary();
        }
    }
   
   
    
