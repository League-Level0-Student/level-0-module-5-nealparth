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
	
	}
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		//String dimes = JOptionPane.showInputDialog("How many dimes do you have");
		//Integer.parseInt(dimes);//

		// Tell them how many cents they have (hint multiply by 10

		//JOptionPane.showMessageDialog(null, "You have,");
		//JOptionPane.showMessageDialog(null, dimes);//

		// Ask the user how tall they are (inches)
///String user= JOptionPane.showInputDialog("How tall are you");
		// If they are shorter than 36 inches, tell them to eat their Wheaties//
//int num= Integer.parseInt(user);//

//if(num<36) {
	//JOptionPane.showMessageDialog(null, "Eat your wheaties");
//}//
	//}//

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		//for(int i=0; i<31;i++) {
			//if(i%3==0) {//
				//System.out.println(i);//
			//}
		//}
	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
int i= new Random().nextInt(20);

System.out.println(i);
 
		// Get another random number that is less than 10 and print it to the console
int d= new Random().nextInt(10);

System.out.println(d);
		 //sing a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction
int x= i-d;
JOptionPane.showMessageDialog(null, x);
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
//String city= JOptionPane.showInputDialog("What city do you live in");
		// If they answered "San Diego", tell them they live in America's Finest City	
	//if(city.equalsIgnoreCase("San Diego")) {
		//JOptionPane.showMessageDialog(null, "You live in America's Finest City");//
	}
		// Otherwise, tell them to move to San Diego
	//else {
		//JOptionPane.showMessageDialog(null, "You should move to San Diego");//
	//}
		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
	
	//String cars= JOptionPane.showInputDialog("How many cars do you have?");	
	//int vehicle=Integer.parseInt(cars);
	
	//if(vehicle==0) {
	//	JOptionPane.showMessageDialog(null, "I bet you use public transportation");//
	//}
			// If there is 1 car, use a pop-up to display the make/model of the car
	//else if(vehicle==1) {
		//JOptionPane.showMessageDialog(null, "here is your model of your car");//
	//}
		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.

	

	void skill5() { // In a pop-up, ask the user for the name of their school
//String school= JOptionPane.showInputDialog("What is the name of your school");
		// In another pop-up, tell the user, that their school is a fantastic school. //
							//JOptionPane.showMessageDialog(null, school);//
							//JOptionPane.showMessageDialog(null, "Your school is fantastic");
		// You must include the name of the school in the message.

	//}//
//}//
	}
	
}
