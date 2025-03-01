<<<<<<< HEAD
import javax.swing.JOptionPane;

public class Lab2_2_5{
	public static void main(String args[]){
		String strNum1, strNum2, res = "";
		double num1, num2;
        
        strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number: ", 
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number: ", 
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		res += String.format("Sum of two numbers: %.2f\n", sum);
		
		double difference = Math.abs(num1 - num2);
		res += String.format("Difference of two numbers: %.2f\n", difference);
		
		double product = num1 * num2;
		res += String.format("Product of two numbers: %.2f\n", product);
		
		if(num2 == 0){
		    res += "Invalid quotient!";
		}
		else{
		    double quotient = num1 / num2;
		    res += String.format("Quotient of two numbers: %.2f", quotient);
		}
		
		JOptionPane.showMessageDialog(null, res);
		System.exit(0);
	}
=======
import javax.swing.JOptionPane;

public class Lab2_2_5{
	public static void main(String args[]){
		String strNum1, strNum2, res = "";
		double num1, num2;
        
        strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Input the first number: ", 
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);
		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Input the second number: ", 
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		res += String.format("Sum of two numbers: %.2f\n", sum);
		
		double difference = Math.abs(num1 - num2);
		res += String.format("Difference of two numbers: %.2f\n", difference);
		
		double product = num1 * num2;
		res += String.format("Product of two numbers: %.2f\n", product);
		
		if(num2 == 0){
		    res += "Invalid quotient!";
		}
		else{
		    double quotient = num1 / num2;
		    res += String.format("Quotient of two numbers: %.2f", quotient);
		}
		
		JOptionPane.showMessageDialog(null, res);
		System.exit(0);
	}
>>>>>>> 9daa0188ea318d3277654c4060e1449b670e86a0
}