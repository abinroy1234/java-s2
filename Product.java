/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author sjcet
 */

public class Product {
    int pcode,pprice;
    String pname;

    Product(int a,int b,String c){
        pcode=a;
        pprice=b;
        pname=c;
    }
    
    public int lowest(){
        return pprice;
    }
    public void display(){
        System.out.println("product code:"+pcode);
        System.out.println("product name:"+pname);
         System.out.println("product code:"+pprice);
        
    }
    public static void main(String[] args) {
        
        
        Product p1=new Product(1001,5000,"Bag");
        Product p2= new Product(1002,12000,"watch");
        Product p3=new Product(1003,120,"book");
        
        if(p1.lowest() < p2.lowest()){
            if(p1.lowest() < p3.lowest()){
              // System.out.println("lowest"+p1.lowest()); 
              System.out.println("Produtc having lowest price :\n");
               p1.display();
                
            }
            else{
               //System.out.println("lowest"+p3.lowest());
                System.out.println("Produtc having lowest price :\n");
              
                p3.display();
            }
            
        }
        
        else if (p2.lowest( ) < p3.lowest()){
           // System.out.println("lowest"+p2.lowest());
            System.out.println("Produtc having lowest price :\n");
              
            p2.display();
        }
        
        else{
         //   System.out.println("lowest"+p3.lowest());
          System.out.println("Produtc having lowest price :\n");
              
            p3.display();
        }
        
       
            
        
    }
        
    
}
