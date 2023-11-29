public class StringToByteExample {
    public static void main(String[] args) {
        // String to byte conversion
        String strByte = "5";

        try {
            byte byteValue = Byte.parseByte(strByte);
            System.out.println("Parsed byte value: " + byteValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Unable to convert to byte.");
        }
    }
}
