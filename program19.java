import java.awt.*;
import java.awt.event.*;
public class program19 extends Frame implements ActionListener 
 {
   TextField t1,t2,t3,t4;
   Label l1,l2,l3,l4;
   Button b1;
   program19()
   {
     setLayout(new FlowLayout());
     t1=new TextField(5);
     t2=new TextField(10);
     t3=new TextField(15);
     t4=new TextField(8);
     l1=new Label("first no");
     l2=new Label("second no");
     l3=new Label("third no");
     l4=new Label("big no");
     b1=new Button("check");
     add(l1);
     add(t1);
     
     add(l2);
     add(t2);
     
     add(l3);
     add(t3);
     
     add(b1);
     add(l4);
     add(t4);
     
     t1.setText("");
     t2.setText("");
     t3.setText("");
     t4.setText("");
     b1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
     {
       int a,b,c,result;
       String str;
       if(ae.getSource()==b1)
        {
          str=t1.getText();
          a=Integer.parseInt(str);
          
          b=Integer.parseInt(t2.getText());
          
          c=Integer.parseInt(t3.getText());
          
          if (a>b && a>c)
              result=a;
          else if (b>c)
              result=b;
          else 
              result=c;
          t4.setText(""+result);
       }
      }
        
     public static void main(String arg[])
     {
     program19 obj=new program19();
     obj.setTitle("kooooii");
     obj.setSize(200,300);
     obj.setVisible(true);
     }
 }
          
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
