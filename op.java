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
