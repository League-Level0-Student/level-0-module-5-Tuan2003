package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
String money = JOptionPane.showInputDialog("How many dimes do you have?"); 
int currency = Integer.parseInt(money); 
double exactChange = currency * .1;
System.out.println("You have " + exactChange);
// Use pop-ups for the following.
// Ask the user how many dimes they have




// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)

String test = JOptionPane.showInputDialog("How tall are you in inches?");
int height = Integer.parseInt(test); 
if(height <36) {
	System.out.println("Go eat your Wheaties!!!");
}
// If they are shorter than 36 inches, tell them to eat their Wheaties
}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 1; i <= 30; i++) {
	if(i%3==0) {
		System.out.println(i);
	}
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random rand = new Random();
int numba = rand.nextInt(20)+1;


System.out.println(numba);


// Get another random number that is less than 10 and print it to the console 
Random lol = new Random();
int number = rand.nextInt(10)+1;

System.out.println(number);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 

for (int i = 0; i < 100; i++) {
int temp= 0;
temp = 100 - i;
System.out.println("The difference between" + i + "and 100 is " + temp );

}


}

void skill4() { // In a pop-up, ask the user for the city they live in 

String userInput = JOptionPane.showInputDialog("What city do you live in? ");
// If they answered "San Diego", tell them they live in America's Finest City 
if(userInput.equalsIgnoreCase("san diego")) {
	System.out.println("You live in America's Finest City");


// Otherwise, tell them to move to San Diego 
}else {
	System.out.println("Move to San Diego, The best city in America");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String temp = JOptionPane.showInputDialog("How many cars does your family have?");
int cars = Integer.parseInt(temp);
if(cars==0) {
	System.out.println("I bet you use public transportation!!!");
}
// If there is 1 car, use a pop-up to display the make/model of the car 
else if(cars==1) {
JOptionPane.showMessageDialog(null, "https://images.wheels.ca/wp-content/uploads/2017/03/shutterstock_277478681.jpg");
}


// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
else if(cars >1) {
JOptionPane.showMessageDialog(null, "https://images.wheels.ca/wp-content/uploads/2017/03/shutterstock_579625213.jpg");
}


}

void skill5() { // In a pop-up, ask the user for the name of their school 
String schoolName = JOptionPane.showInputDialog("What is the name of your school?");
JOptionPane.showMessageDialog(null, "Wow " + schoolName + " is a fantastic school!!!!");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



}
}