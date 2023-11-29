public class DoubleToStringExample {
    public static void main(String[] args) {
        // double to String conversion
        double doubleValue = 3.14;

        // Using Double.toString()
        String strValue = Double.toString(doubleValue);

        // Alternatively, using String.valueOf()
        // String strValue = String.valueOf(doubleValue);

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted String value: " + strValue);
    }
}
