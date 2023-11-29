public class StringToShortExample {
    public static void main(String[] args) {
        // String to short conversion
        String strShort = "42";

        try {
            short shortValue = Short.parseShort(strShort);
            System.out.println("Parsed short value: " + shortValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert to short.");
        }
    }
}
