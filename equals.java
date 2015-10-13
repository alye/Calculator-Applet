 /**
 * Class to process the pressing of '= sign
 */
 package com.apps.calculator;
 
 public class equals implements ActionListener
 {
   private Calc c;            //Local Instance of Calc created to store reference to the class whose '=' sign is pressed
   private Button b;          //Local Instance of Button created to store reference to the respective '=' Button
   /**
     * Constructor to load the private variables of equals class
     * @param Calc A reference to the Calc class which contains the equals Button
     * @return Void/No return Value
     * @exception Any Exception
     */
     equals(Calc x)
     {
       c=x;
       b=c.sign[4];
     }
     
     /** 
     * Implementing actionPerformed(ActionEvent) method of ActionListener interface.
     * Specifies steps to be taken when the equals button is clicked
     * @param ActionEvent A semantic event which indicates that a component-defined action occurred.It is generated 
     * by a Button when the component-specific action occurs (such as being pressed). 
     * @return Void/No return Value
     * @exception Any Exception
     */
     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource()==b)
        {
          private double no2=Double.parseDouble(c.t.getText());       //Temp Variable to store operand 2
          /**
           * Loading sign information and performing the desired operation between operand one and operand 2
           */
           if(c.s.equalsIgnoreCase("+"))
              c.d+=no2;
           else if(c.s.equalsIgnoreCase("-"))
              c.d-=no2;
           else if(c.s.equalsIgnoreCase("*"))
              c.d*=no2;
           else if(c.s.equalsIgnoreCase("/"))
              c.d/=no2;
           /** Update the main layout's display
            */
            c.t.setText(""+c.d);
          }
      }
 }
