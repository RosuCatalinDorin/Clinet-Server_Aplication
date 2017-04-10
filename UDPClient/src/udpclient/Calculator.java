package udpclient;
import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    //  f = Frame, T = TextField, btn = button
    //   i.e btn1 means Button 1
    
   JFrame f;
   JTextField t;
   JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
   JButton odiv,omul,osub,oadd,btneq,btndel,btnclr;
 
   //   initililze variables 
   
    static double num1,num2=0,result=0;
    static int operator=0;
 
    Calculator()
    {
        f=new JFrame("Calculator");
        t=new JTextField();
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btn0=new JButton("0");
        odiv=new JButton("/");
        omul=new JButton("*");
        osub=new JButton("-");
        oadd=new JButton("+");
        btneq=new JButton("=");
        btndel=new JButton("Delete");
        btnclr=new JButton("Clear");
        
        t.setBounds(30,40,280,30);
        btn7.setBounds(40,100,50,40);
        btn8.setBounds(110,100,50,40);
        btn9.setBounds(180,100,50,40);
        odiv.setBounds(250,100,50,40);
        
        btn4.setBounds(40,170,50,40);
        btn5.setBounds(110,170,50,40);
        btn6.setBounds(180,170,50,40);
        omul.setBounds(250,170,50,40);
        
        btn1.setBounds(40,240,50,40);
        btn2.setBounds(110,240,50,40);
        btn3.setBounds(180,240,50,40);
        osub.setBounds(250,240,50,40);
        
        
        btn0.setBounds(60,310,50,40);
        btneq.setBounds(140,310,50,40);
        oadd.setBounds(220,310,50,40);
        
        btndel.setBounds(60,380,80,40);
        btnclr.setBounds(170,380,80,40);
        

        f.add(t);
        f.add(btn7);
        f.add(btn8);
        f.add(btn9);
        f.add(odiv);
        f.add(btn4);
        f.add(btn5);
        f.add(btn6);
        f.add(omul);
        f.add(btn1);
        f.add(btn2);
        f.add(btn3);
        f.add(osub);
        
        f.add(btn0);
        f.add(btneq);
        f.add(oadd);
        f.add(btndel);
        f.add(btnclr);
        
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        oadd.addActionListener(this);
        odiv.addActionListener(this);
        omul.addActionListener(this);
        osub.addActionListener(this);
        
        btneq.addActionListener(this);
        btndel.addActionListener(this);
        btnclr.addActionListener(this);
        
        
        
    }
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
            t.setText(t.getText().concat("1"));
        
        if(e.getSource()==btn2)
            t.setText(t.getText().concat("2"));
        
        if(e.getSource()==btn3)
            t.setText(t.getText().concat("3"));
        
        if(e.getSource()==btn4)
            t.setText(t.getText().concat("4"));
       
        if(e.getSource()==btn5)
            t.setText(t.getText().concat("5"));
        
        if(e.getSource()==btn6)
            t.setText(t.getText().concat("6"));
        
        if(e.getSource()==btn7)
            t.setText(t.getText().concat("7"));
        
        if(e.getSource()==btn8)
            t.setText(t.getText().concat("8"));
        
        if(e.getSource()==btn9)
            t.setText(t.getText().concat("9"));
        
        if(e.getSource()==btn0)
            t.setText(t.getText().concat("0"));
        
        if(e.getSource()==oadd)
        {
            num1=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        } 
        
        if(e.getSource()==osub)
        {
           // num1=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        
        if(e.getSource()==omul)
        {
            num1=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        
        if(e.getSource()==odiv)
        {
            num1=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        
        if(e.getSource()==btneq)
        {
            num2=Double.parseDouble(t.getText());
       // switch case check and perform operator according to input
            
            switch(operator)
            {
                case 1: result=num1+num2;
                    break;
        
                case 2: result=num1-num2;
                    break;
        
                case 3: result=num1*num2;
                    break;
        
                case 4: result=num1/num2;
                    break;
        
                default: System.out.println("Enter valid operator");
            }
        // switch case end 
            t.setText(""+result);
        }
        
        if(e.getSource()==btnclr)
            t.setText("");
        
        if(e.getSource()==btndel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
            t.setText(t.getText()+s.charAt(i));
        }        
       
    }
     
   
    //   main of the program where we call.
   
}