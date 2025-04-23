package two_two_six;
import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String args[]) {
        String aStr = JOptionPane.showInputDialog("Input a: ");
        String bStr = JOptionPane.showInputDialog("Input b: ");
        String cStr = JOptionPane.showInputDialog("Input c: ");
        String res = "";
        
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        if (a == 0) {
            if (b == 0) {
                res += (c == 0) ? "Infinite Solution" : "No Solution";
            } else {
                double y = -c / b;
                res += String.format("y = %.2f", y);
            }
        } else {
            double x = -b / a;
            res += String.format("x = %.2f", x);
        }

        JOptionPane.showMessageDialog(null, res);
        System.exit(0);
    }
}
