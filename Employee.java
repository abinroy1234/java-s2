/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author sjcet
 */
public class Employee {
   int empid;
   float salary;
   String empname;
Employee(int a,String b,float c)
{
    empid=a;
    empname=b;
    salary=c;

}
public void salary()
{
    float t_salary=salary+((salary*20)/100);
    System.out.println("salary is"+t_salary);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee s1=new Employee(101,"abin",2500);
         Employee s2=new Employee(102,"alan",5500);
         s1.salary();
         s2.salary();
        
        // TODO code application logic here
    }
    
}