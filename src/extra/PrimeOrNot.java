package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
String Number = JOptionPane.showInputDialog("Type in a number and I will decide whether it is prime or not");
int Input = Integer.parseInt(Number);

for (int i = 2; i < Input-1; i++) {
	if(Input%i== 0) {
		
		System.out.println("Not Prime");
		break;
	}else{
	System.out.println("Prime");
	break;
	}
	
	
	
}

	
	
}

	


}
