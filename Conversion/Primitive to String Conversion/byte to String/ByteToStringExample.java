public class ByteToStringExample {
    public static void main(String[] args) {
        // byte to String conversion
        byte byteValue = 5;

        // Using Byte.toString()
        String strValue = Byte.toString(byteValue);

        // Alternatively, using String.valueOf()
        // String strValue = String.valueOf(byteValue);

        System.out.println("Original byte value: " + byteValue);
        System.out.println("Converted String value: " + strValue);
    }
}
