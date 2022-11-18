/*Conversation.java   
  Practice with Scanner class */
import java.util.Scanner; //for input

public class Conversation {
    public static void main(String[] args)
  {
	Scanner reader = new Scanner(System.in);
	String firstName, lastName, input;
	char middleInitial;
	int birthyear;
	double priceOrange;
	double pricePeanuts;
  double priceBread;
  double priceWatermelon;
	double totalPrice=0;  //initialize to 0
   
  System.out.println("Welcome. Type your first name and press enter.");
	firstName = reader.nextLine();
	System.out.println("Type your middle initial and press enter.");
	input = reader.nextLine();
	middleInitial = input.charAt(0);
	System.out.println("Type your last name and press enter.");
	lastName = reader.nextLine();
   
	System.out.println("Hi " + firstName + " " +
                   	middleInitial + ". " +lastName);
   
	System.out.print("Enter year you were born> ");
	birthyear = reader.nextInt();
	System.out.println("Approximate age: " + (2022-birthyear));
   
	//Part 5 code goes here.
  int houseNumber;
  String streetName;
  System.out.print("Enter house number> ");
  houseNumber = reader.nextInt();
  streetName = reader.nextLine();
  System.out.print("Enter street name> ");
  streetName = reader.nextLine();

   

    
    //Part 6 Add code to read the rest of the address (city, state, zipcode) and print it
  String city;
  String state;
  String zipcode;
  System.out.print("Enter city> ");
  city = reader.nextLine();
  System.out.print("Enter state> ");
  state = reader.nextLine();
  System.out.print("Enter zipcode> ");
  zipcode = reader.nextLine();
  System.out.println("Address: " + houseNumber + " " + streetName + " " + city + " " + state + " " + zipcode + " "); 


    //////////////////////////////
   
	System.out.print("How much do the oranges cost? $");
	priceOrange = reader.nextDouble();
	totalPrice += priceOrange;
	System.out.print("How much do the peanuts cost? $");
	pricePeanuts = reader.nextDouble();
	totalPrice += pricePeanuts;
    //Part 4 code for bread and watermelon
  System.out.print("How much does the bread cost? $");
	priceBread = reader.nextDouble();
	totalPrice += priceBread;
  System.out.print("How much does the watermelon cost? $");
	priceWatermelon = reader.nextDouble();
	totalPrice += priceWatermelon;


	System.out.println("The total cost is $" + totalPrice);
   



  } // end main

    
}
