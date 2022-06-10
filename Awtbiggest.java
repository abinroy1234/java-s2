package awtbiggest;

import java.awt.*;
import java.awt.event.*;

public class Awtbiggest implements ActionListener {

Frame f=new Frame();
Label l1=new Label("First Number");
Label l2=new Label("Second Number");
Label l3=new Label("Third Number");
Label l4=new Label("Largest Number");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();

Button b1=new Button("find");
Button b2=new Button("Cancel");


Awtbiggest()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
l3.setBounds(50,180,100,20);
l4.setBounds(50,220,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
t3.setBounds(200,180,100,20);
t4.setBounds(200,220,100,20);
b1.setBounds(50,250,50,20);
b2.setBounds(110,250,50,20);


f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t4);
f.add(b1);
f.add(b2);

b1.addActionListener(this);
b2.addActionListener(this);

f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);

}

public void actionPerformed(ActionEvent e)
{
  int n1=Integer.parseInt(t1.getText());
  int n2=Integer.parseInt(t2.getText());
  int n3=Integer.parseInt(t3.getText());
if(e.getSource()==b1)
{
    if(n1>n2){
        if(n1>n3){
            t4.setText(String.valueOf(n1));
           
        }
    }
    else if(n2>n3){
         t4.setText(String.valueOf(n2));
    }
    else{
        t4.setText(String.valueOf(n3));
    }

}

if(e.getSource()==b2)
{
System.exit(0);
}
}
   
    public static void main(String[] args) {
       

        new Awtbiggest();
       
    }
   
}
