<<<<<<< HEAD
import javax.swing.JOptionPane;

public class ShowTwoNumbers{
	public static void main(String args[]){
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number: ", 
				JOptionPane.INFORMATION_MESSAGE);

		strNotification += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number: ", 
				JOptionPane.INFORMATION_MESSAGE);

		strNotification += strNum2;

		JOptionPane.showMessageDialog(null, strNotification, 
		"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
=======
import javax.swing.JOptionPane;

public class ShowTwoNumbers{
	public static void main(String args[]){
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number: ", 
				JOptionPane.INFORMATION_MESSAGE);

		strNotification += strNum1 + " and ";
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number: ", 
				JOptionPane.INFORMATION_MESSAGE);

		strNotification += strNum2;

		JOptionPane.showMessageDialog(null, strNotification, 
		"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
>>>>>>> 9daa0188ea318d3277654c4060e1449b670e86a0
} 