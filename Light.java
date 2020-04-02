/**
@author:Saurav Pradhan


Java program to represent a conference hall light.
It contains 3 constants, private int data field named brightness,private boolean data field named on,
string data field named color,accessor and mutator methods for all three data fields,no-arg/default constructor that creates a default light,
A method named toString().
**/

public class Light{
    
    //delcaring and assigning the value of  the constants
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    //private data fields as specified in the interact with their defaul value set.
    private int brightness = 1;
    private boolean on = false;
    private String color = "red";

    //accessor method for the brightness
    public int getBrightness(){
        return brightness;
    }

    //accessor method for the on
    public boolean getOn(){
        return on;
    }

    //accessor method for the color
    public String getColor(){
        return color;
    }


    //mutator method for brightness
    public void setBrightness(int brightnessData){
        brightness = brightnessData;
    }

    //mutator method for on
    public void setOn(boolean onData){
        on = onData;
    }

    //mutator method for color
    public void setColor(String colorData){
        color = colorData;
    }


    //no-arg/default constructor that creates a default light
    public Light(){

    }

    
    //A method named toString() that returns a string description for the light.
    public String toString(){
        if (on){
            /**ask about this ...assign HIGH LOW or number is ok*/
            return ("The brightness is " + brightness + " and the color is " + color);
        }else{
            return ("The color is " + color + " and the light is off");
        }
    }   
}