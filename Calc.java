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

        

      

