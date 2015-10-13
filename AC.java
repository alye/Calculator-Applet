/**
 * Class to perform the 'AC' operation.
 */
 public class AC implements ActionListener
{
    private Calc c;                     //Local Instance of Calc created to store reference to the calling class
    private Button b;                   //Local Instance of Button created to store reference to the Ac
    /**
     * Constructor to pass instance of the calling Calc class to the AC class
     */
    AC(Calc x)                          
    {
        c=x;
        b=c.sign[5];
    }
    
    /** 
     * Implementing actionPerformed(ActionEvent) method of ActionListener interface.
     * Specifies steps to be taken when AC button is clicked
     */
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
                /** 
                 * Clear memory of parent class
                 */
                c.d=0;
                c.s="";
                c.t.setText("0");
        }
            
    }
}
