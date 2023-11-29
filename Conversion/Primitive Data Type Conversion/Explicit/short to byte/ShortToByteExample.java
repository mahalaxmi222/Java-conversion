public class ShortToByteExample {
    public static void main(String[] args) {
        // Narrowing conversion from short to byte
        short shortValue = 50;
        byte byteValue = (byte) shortValue; // Explicit narrowing conversion

        // Displaying values before and after conversion
        System.out.println("Original short value: " + shortValue);
        System.out.println("Narrowed byte value: " + byteValue);
    }
}
