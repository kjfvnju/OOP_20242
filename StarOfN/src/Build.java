import javax.swing.JOptionPane;
public class Build {
	public static void main(String args[]) {
		String numStr = JOptionPane.showInputDialog( 
				"Input n: ");
		int num = Integer.parseInt(numStr);
		String res = "";
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < 2*num - 1; j++) {
				if(j < num - i - 1) res += " ";
				else if(j < num + i) res += '*';
				else res += " ";
			}
			res += "\n";
		}
		
		JOptionPane.showMessageDialog(null, res);
		
		System.exit(0);
	}
}
