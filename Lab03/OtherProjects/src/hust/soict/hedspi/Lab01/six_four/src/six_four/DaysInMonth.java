package six_four;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class DaysInMonth {
    public static void main(String args[]) {
        Map<String, Integer> monthMap = new HashMap<>();
        monthMap.put("january", 1); monthMap.put("jan", 1); monthMap.put("1", 1);
        monthMap.put("february", 2); monthMap.put("feb", 2); monthMap.put("2", 2);
        monthMap.put("march", 3); monthMap.put("mar", 3); monthMap.put("3", 3);
        monthMap.put("april", 4); monthMap.put("apr", 4); monthMap.put("4", 4);
        monthMap.put("may", 5); monthMap.put("5", 5);
        monthMap.put("june", 6); monthMap.put("jun", 6); monthMap.put("6", 6);
        monthMap.put("july", 7); monthMap.put("jul", 7); monthMap.put("7", 7);
        monthMap.put("august", 8); monthMap.put("aug", 8); monthMap.put("8", 8);
        monthMap.put("september", 9); monthMap.put("sep", 9); monthMap.put("9", 9);
        monthMap.put("october", 10); monthMap.put("oct", 10); monthMap.put("10", 10);
        monthMap.put("november", 11); monthMap.put("nov", 11); monthMap.put("11", 11);
        monthMap.put("december", 12); monthMap.put("dec", 12); monthMap.put("12", 12);

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String monthStr = JOptionPane.showInputDialog("Input month: ").toLowerCase();
        String yearStr = JOptionPane.showInputDialog("Input year: ");

        if (!yearStr.matches("\\d{4}")) {
            JOptionPane.showMessageDialog(null, "Invalid year. Please enter a 4-digit year.");
            System.exit(0);
        }

        if (!monthMap.containsKey(monthStr)) {
            JOptionPane.showMessageDialog(null, "Invalid month. Please enter again.");
            System.exit(0);
        }

        int month = monthMap.get(monthStr);
        int year = Integer.parseInt(yearStr);
        int days = daysInMonth[month - 1];

        if (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            days = 29;
        }

        JOptionPane.showMessageDialog(null, String.format("Number of day in month %s: %d", monthStr, days));
        System.exit(0);
    }
}
