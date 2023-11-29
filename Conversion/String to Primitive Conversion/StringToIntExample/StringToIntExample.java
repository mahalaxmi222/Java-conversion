public class StringToIntExample {
    public static void main(String[] args) {
        // String to int conversion
        String strInt = "123";

        try {
            int intValue = Integer.parseInt(strInt);
            System.out.println("Parsed int value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert to int.");
        }
    }
}
