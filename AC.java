        public class AC implements ActionListener
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
