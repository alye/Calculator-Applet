/**
 * Class to perform the 'AC' operation.
 */
 public class AC implements ActionListener
{
    private Calc c;                     //Local Instance of Calc created to store reference to the class on which AC has to be performed
    private Button b;                   //Local Instance of Button created to store reference to the AC button of the Calc instance
    /**
     * Constructor to pass instance of the calling Calc class to the AC class
     * @param Calc A reference to the Calc class on which the AC operation has to be performed
     * @return Void/No return Value
     * @exception Any Exception
     */
    AC(Calc x)                          
    {
        c=x;
        b=c.sign[5];                    //Initialize local Button value with that of the class on which AC is being performed
    }
    
    /** 
     * Implementing actionPerformed(ActionEvent) method of ActionListener interface.
     * Specifies steps to be taken when AC button is clicked
     * @param ActionEvent A semantic event which indicates that a component-defined action occurred.It is generated 
     * by a Button when the component-specific action occurs (such as being pressed). 
     * @return Void/No return Value
     * @exception Any Exception
     */
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
                /** 
                 * Clear memory and display
                 */
                c.d=0;
                c.s="";
                c.t.setText("0");
        }
            
    }
}
