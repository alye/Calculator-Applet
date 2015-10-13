/**
 * Class to handle the digits
 */
 
package com.apps.calculator;

public class digit implements ActionListener
        {
            private Calc c;             //Local Instance of Calc created to store reference to the class containing the digits
            private Button b;           //Local Instance of Button created to store reference to the respective Digit Button
            /**
             * Constructor to load the private variables of digit class
             * @param Calc A reference to the Calc class which contains the digit Buttons
             * @param Button A reference to the Digit Button for which the listener is being implemented
             * @return Void/No return Value
             * @exception Any Exception
             */
            digit(Calc x,Button i)
            {
                b=i;
                c=x;
            }
           /** 
             * Implementing actionPerformed(ActionEvent) method of ActionListener interface.
             * Specifies steps to be taken when a digit button is clicked
             * @param ActionEvent A semantic event which indicates that a component-defined action occurred.It is generated
             * by a Button when the component-specific action occurs (such as being pressed). 
             * @return Void/No return Value
             * @exception Any Exception
             */
            public void actionPerformed(ActionEvent e)
            {
                //Update the string in the display to reflect the digit pressed
                if(e.getSource()==b)
                    c.t.setText(c.t.getText() +b.getLabel());
            }

        }

 
