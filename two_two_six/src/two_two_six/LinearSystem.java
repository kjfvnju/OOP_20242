package two_two_six;
import javax.swing.JOptionPane;

public class LinearSystem {
    public static void main(String args[]) {
        String a1Str = JOptionPane.showInputDialog("Input a1: ");
        String b1Str = JOptionPane.showInputDialog("Input b1: ");
        String c1Str = JOptionPane.showInputDialog("Input c1: ");
        String a2Str = JOptionPane.showInputDialog("Input a2: ");
        String b2Str = JOptionPane.showInputDialog("Input b2: ");
        String c2Str = JOptionPane.showInputDialog("Input c2: ");
        String res = "";
        
        double a1 = Double.parseDouble(a1Str);
        double b1 = Double.parseDouble(b1Str);
        double c1 = Double.parseDouble(c1Str);
        double a2 = Double.parseDouble(a2Str);
        double b2 = Double.parseDouble(b2Str);
        double c2 = Double.parseDouble(c2Str);

        double det = a1 * b2 - a2 * b1;
        
        if (det == 0) {
            if (a1 * c2 == a2 * c1 && b1 * c2 == b2 * c1) {
                res = "Infinite Solutions";
            } else {
                res = "No Solution";
            }
        } else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            res = String.format("x = %.2f, y = %.2f", x, y);
        }
        
        JOptionPane.showMessageDialog(null, res);
        System.exit(0);
    }
}
