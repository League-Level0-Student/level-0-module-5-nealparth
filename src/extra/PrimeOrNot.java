package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	boolean isPrime=true;
	int num = Integer.parseInt(JOptionPane.showInputDialog("Type in a number"));
	for(int i=2;i<num;i++) {
		if((num%i==0)) {
			isPrime= false;
			System.out.println("Scoopity Poop");
		}
	}
	if(isPrime) {
	System.out.println("That's a prime number! Big Baller Style!");
	}
	
}
}
