public class ByteToShortExample {
    public static void main(String[] args) {
        // Widening conversion from byte to short
        byte byteValue = 120;
        short shortValue = byteValue; // Implicit widening conversion
       
        // Displaying values before and after conversion
        System.out.println("Original byte value: " + byteValue);
        System.out.println("Widened short value: " + shortValue);
    }
}
