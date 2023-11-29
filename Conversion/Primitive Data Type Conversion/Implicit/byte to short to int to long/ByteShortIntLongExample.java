public class ByteShortIntLongExample {
    public static void main(String[] args) {
        // Widening conversion from byte to short to int to long
        byte byteValue = 10;
        short shortValue = byteValue;   // byte to short (implicit)
        int intValue = shortValue;      // short to int (implicit)
        long longValue = intValue;      // int to long (implicit)

        // Displaying values before and after conversion
        System.out.println("Original byte value: " + byteValue);
        System.out.println("Widened short value: " + shortValue);
        System.out.println("Widened int value: " + intValue);
        System.out.println("Widened long value: " + longValue);
    }
}
