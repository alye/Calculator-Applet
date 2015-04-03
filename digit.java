public class digit implements ActionListener
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

 
