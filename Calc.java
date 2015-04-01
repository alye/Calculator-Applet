import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
 <APPLET
	CODE=Calc.class
	HSPACE=700
	VSPACE=300
	HEIGHT=140
	WIDTH=250>
</APPLET>
 */

public class Calc extends Applet
{
    public TextField t;
    public double d=0;
    public String s;
    public Button b[];
    public Button sign[];


    public void init()
    {
     add(new Label("CALCULATOR v1.0",Label.CENTER));
    t=new TextField(28);
    t.setText(""+0);
    add(t);
    b=new Button[11];
    for(int i=0;i<=10;i++)
    {
        if(i<=9)
            b[i]=new Button(""+i+"");
        else
            b[i]=new Button(".");

        add(b[i]);
        b[i].addActionListener(new digit(this,b[i]));
    }

    sign=new Button[6];
    sign[0]=new Button("+");
    sign[1]=new Button("-");
    sign[2]=new Button("*");
    sign[3]=new Button("/");
    sign[4]=new Button("=");
    sign[5]=new Button("AC");


    for(int i=0;i<=5;i++)
        add(sign[i]);

    for(int i=0;i<=3;i++)
    sign[i].addActionListener(new op(this,sign[i]));

      sign[4].addActionListener(new equals(this));
      sign[5].addActionListener(new AC(this));
      add(new Label("-Alizishaan Khatri",Label.CENTER));

   
     }

    
}

        class digit implements ActionListener
        {
            Button b;
            Calc c;
            digit(Calc x,Button i)
            {
                b=i;
                c=x;
            }

            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b)
                    c.t.setText(c.t.getText() +b.getLabel());
            }

        }

        class op implements ActionListener
        {
            Calc c;
            Button b;
            op(Calc x,Button y)
            {
                c=x;
                b=y;
            }

            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b)
                {
                    c.s=b.getLabel();
                    c.d=Double.parseDouble(c.t.getText());
                    c.t.setText(""+0);

                }
            }
        }

        class equals implements ActionListener
        {
            Calc c;
            Button b;

            equals(Calc x)
            {
                c=x;
                b=c.sign[4];
            }

            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b)
                {
                   double no2=Double.parseDouble(c.t.getText());

                   if(c.s.equalsIgnoreCase("+"))
                       c.d+=no2;
                   else if(c.s.equalsIgnoreCase("-"))
                       c.d-=no2;
                   else if(c.s.equalsIgnoreCase("*"))
                       c.d*=no2;
                   else if(c.s.equalsIgnoreCase("/"))
                       c.d/=no2;

                   c.t.setText(""+c.d);


                }

            }
        }

        class AC implements ActionListener
        {
            Calc c;
            Button b;
            AC(Calc x)
            {
                c=x;
                b=c.sign[5];
            }
            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource()==b)
                {
                    c.d=0;
                    c.s="";
                    c.t.setText("0");
                }
            }
        }
