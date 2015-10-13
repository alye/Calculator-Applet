/**
 * A simple Calculator applet implemented using Java.
 * Please include the following code snippet in a HTML file to run the app:
 * <APPLET
 * 	CODE=Calc.class
 * 	HSPACE=700
 * 	VSPACE=300
 * 	HEIGHT=140
 * 	WIDTH=250>
 * 	</APPLET>
 */

package com.apps.calculator;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/** The primary Java Applet class. Used to draw the graphical layout 
*/
public class Calc extends Applet
{
    private TextField t;		//Text Field Object to display the calculator's workspace
    private double d=0;
    private String s;			
    private Button b[],sign[];		//Arrays to store the number and sign buttons

    /* Method called to instantiate the applet 
    */
    public void init()
    {
    add(new Label("CALCULATOR v1.0",Label.CENTER)); 		//Display the applet's title
    t=new TextField(28);					//Initializing the Text Field Object with zero values
    t.setText(""+0);
    add(t);							//Add the Text Field to the layout
    b=new Button[11];
    //Loop to initialize the numeral and decimal point buttons with the respective values
    for(int i=0;i<=10;i++)
    {
        if(i<=9)
            b[i]=new Button(""+i+"");
        else
            b[i]=new Button(".");

        add(b[i]); 						//Add the button to the layout
        b[i].addActionListener(new digit(this,b[i]));		//Add listener for each Button object
    }

    //Initializing the sign Button array with appropriate values
    sign=new Button[6];
    sign[0]=new Button("+");
    sign[1]=new Button("-");
    sign[2]=new Button("*");
    sign[3]=new Button("/");
    sign[4]=new Button("=");
    sign[5]=new Button("AC");

    //Loop to add each button to the layout
    for(int i=0;i<=5;i++)
        add(sign[i]);
    //Loop to add listeners to the Operators (+,-,* and /)
    for(int i=0;i<=3;i++)
        sign[i].addActionListener(new op(this,sign[i]));

    //Adding Listeners to the '=' and 'AC' buttons
    sign[4].addActionListener(new equals(this));
    sign[5].addActionListener(new AC(this));
    
    //Display author information
    add(new Label("-Alizishaan Khatri",Label.CENTER));

   
     }

    
}

        

      

