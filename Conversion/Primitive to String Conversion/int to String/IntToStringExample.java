public class IntToStringExample {
    public static void main(String[] args) {
        // int to String conversion
        int intValue = 42;

        // Using Integer.toString()
        String strValue = Integer.toString(intValue);

        // Alternatively, using String.valueOf()
        // String strValue = String.valueOf(intValue);

        System.out.println("Original int value: " + intValue);
        System.out.println("Converted String value: " + strValue);
    }
}
