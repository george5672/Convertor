package app;

import java.util.Locale;

public class DataProvider {

    public static String[] getProductNames() {
        return new String[] {"apple", "grape", "mango", "apple", "orange"};
    }

    public static double[] getSalesAmounts() {
        return new double[] {1520.89, 2058.35, 1807.29, 899.99, 1924.25};
    }

    public static String[] getFormattedSales() {
        double[] amounts = getSalesAmounts();
        String[] formatted = new String[amounts.length];

        for (int i = 0; i < amounts.length; i++) {
            formatted[i] = String.format(Locale.US, "$%,.2f", amounts[i]);
        }

        return formatted;
    }
}