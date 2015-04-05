 package com.apps.calculator;
 
 public class equals implements ActionListener
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
