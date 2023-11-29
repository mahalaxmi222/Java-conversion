public class StringToLongExample {
    public static void main(String[] args) {
        // String to long conversion
        String strLong = "9876543210";

        try {
            long longValue = Long.parseLong(strLong);
            System.out.println("Parsed long value: " + longValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert to long.");
        }
    }
}
