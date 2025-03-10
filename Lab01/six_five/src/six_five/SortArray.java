package six_five;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class SortArray {
    public static void main(String args[]) {
        String input = JOptionPane.showInputDialog("Enter numbers separated by spaces:");
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        Arrays.sort(numbers);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;

        String result = "Sorted Array: " + Arrays.toString(numbers) + 
                        "\nSum: " + sum + 
                        "\nAverage: " + String.format("%.2f", average);

        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
    }
}
