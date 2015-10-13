package com.apps.calculator;

/**
 * Class to process operator Button clicks
 */
public class op implements ActionListener
 {
   private Calc c;            //Local Instance of Calc created to store reference to the class containing operands
   private Button b;          //Local Instance of Button created to store reference to the respective '=' Button
   
   /**
     * Constructor to load the private variables of op class
     * @param Calc A reference to the Calc class which contains the operators
     * @param Button A reference to the respective operator Button
     * @return Void/No return Value
     * @exception Any Exception
     */
     op(Calc x,Button y)
     {
         c=x;
         b=y;
     }
     
     /** 
     * Implementing actionPerformed(ActionEvent) method of ActionListener interface.
     * Specifies steps to be taken when an operator button is clicked
     * @param ActionEvent A semantic event which indicates that a component-defined action occurred.It is generated 
     * by a Button when the component-specific action occurs (such as being pressed). 
     * @return Void/No return Value
     * @exception Any Exception
     */
     public void actionPerformed(ActionEvent e)
     {
         if(e.getSource()==b)
         {
             c.s=b.getLabel();                                   //Store the operator in memory
             c.d=Double.parseDouble(c.t.getText());              //Store operand 1 in memory
             c.t.setText(""+0);                                  //Clear display

         }
     }
 }
