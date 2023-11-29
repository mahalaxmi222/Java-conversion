public class StringToFloatExample {
    public static void main(String[] args) {
        // String to float conversion
        String strFloat = "2.718";

        try {
            float floatValue = Float.parseFloat(strFloat);
            System.out.println("Parsed float value: " + floatValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert to float.");
        }
    }
}
