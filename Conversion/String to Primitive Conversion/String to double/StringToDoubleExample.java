public class StringToDoubleExample {
    public static void main(String[] args) {
        // String to double conversion
        String strDouble = "3.14";

        try {
            double doubleValue = Double.parseDouble(strDouble);
            System.out.println("Parsed double value: " + doubleValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert to double.");
        }
    }
}
