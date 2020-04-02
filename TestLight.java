/**
@author:Saurav Pradhan
Student ID: 11651300
Subject: Programming in Java 1

This program assigns high brightness, color yellow, and turn it on to the first object. 
Assigns medium brightness, color blue, and turn it off to the second object and then
displays the objects by invoking their respective toString methods.
**/

public class TestLight{
	public static void main (String [] args){

		


		//displaying the message to the user for creating the first light object
		System.out.println("\nCreating the first light object light1 ");
		Light light1 = new Light();
		System.out.println("The light object light1 has been created \n");

		//setting the value specified in the header comment using the mutator(set) method
		System.out.println("-------------Using setMethod() for light1------------------");

		//setting  the brightness of the light
		System.out.println("Setting the bightness of Light 1 to High ");
		light1.setBrightness(3);
		System.out.println("The bightness of Light 1 has been set to High \n");

		//setting the color of the light to yellow of the light 1
		System.out.println("Setting the color of Light 1 to yellow ");
		light1.setColor("yellow");
		System.out.println("The color of Light 1 has been set to yellow\n ");

		//setting the value of light to true.
		System.out.println("Switching the light on ");
		light1.setOn(true);
		System.out.println("The light has been switched on \n");
		System.out.println("----------------------------------------------------------");


		//displaying the value of the light1 object to the user.
		System.out.println(light1.toString());
		System.out.println("----------------------------------------------------------\n\n");


		//displaying the message to the user for creation of the second light object.
		System.out.println("Creating the first light object light2 ");
		Light light2 = new Light();
		System.out.println("The light object light2 has been created \n");

		//using the set method for the light2
		System.out.println("-------------Using setMethod() for light2------------------");
		System.out.println("Setting the bightness of Light 2 to Medium ");

		//setting up the brightness of light2
		light2.setBrightness(2);
		System.out.println("The bightness of Light 2 has been set to Medium \n");

		//setting up the color of the light2
		System.out.println("Setting the color of Light 2 to blue ");
		light2.setColor("blue");
		System.out.println("The color of Light 2 has been set to blue \n");

		//switching the light off
		System.out.println("Switching the light off ");
		light2.setOn(false);
		System.out.println("The light has been switch off \n");
		System.out.println("----------------------------------------------------------");

		//displaying the value of the light 2 to the user
		System.out.println(light2.toString());
		System.out.println("----------------------------------------------------------\n\n");
		//getting the brightness, color and light status


		//using the accessor method
		System.out.println("-------------Using getMethod() for light1------------------");

		//using get method for getting the brightness of light1
		System.out.print("\nExtracting the brightness of light1 using getBrightness(): ");
		System.out.println(light1.getBrightness());
		System.out.println("The light1 is extrated using getBrightness() \n");

		//using get method for getting the color of light1
		System.out.print("Extracting the color of light1 using getColor(): ");
		System.out.println(light1.getColor());
		System.out.println("The color of light1 has been extrated using getColor() \n");
		System.out.print("Extracting the light status of light1 using getOn(): ");

		//using get method to get whether the light is turned on or not
		System.out.println(light1.getOn());
		System.out.println("The status of light1 has been extracted using getOn() \n");
		System.out.println("----------------------------------------------------------");

		

		//using the accessor method for light2 object
		System.out.println("-------------Using getMethod() for light2------------------");
		System.out.print("\nExtracting the brightness of light2 using getBrightness(): ");

		//using get method to get the brightness of light2
		System.out.println(light1.getBrightness());
		System.out.println("The light2 is extrated using getBrightness()\n");

		//using the get method to get the color of light2
		System.out.print("Extracting the color of light2 using getColor(): ");
		System.out.println(light1.getColor());
		System.out.println("The color of light2 has been extrated using getColor()\n");
		System.out.print("Extracting the light status of light2 getOn(): ");

		//using the get method for getting the light status of the light2
		System.out.println(light1.getOn());
		System.out.println("The status of light2 has been extracted getOn() \n");
		System.out.println("----------------------------------------------------------");



		
	
	}
}