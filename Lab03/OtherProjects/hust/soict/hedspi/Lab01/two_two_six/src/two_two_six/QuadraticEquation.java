package two_two_six;
import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String args[]) {
        String aStr = JOptionPane.showInputDialog("Input a: ");
        String bStr = JOptionPane.showInputDialog("Input b: ");
        String cStr = JOptionPane.showInputDialog("Input c: ");
        String res = "";

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        double d = b * b - 4 * a * c;

        if (d < 0) {
            res = "No Real Solution";
        } else if (d == 0) {
            double x = -b / (2 * a);
            res = String.format("x = %.2f", x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            res = String.format("x1 = %.2f, x2 = %.2f", x1, x2);
        }

        JOptionPane.showMessageDialog(null, res);
        System.exit(0);
    }
}
