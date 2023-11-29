public class LongToStringExample {
    public static void main(String[] args) {
        // long to String conversion
        long longValue = 9876543210L;

        // Using Long.toString()
        String strValue = Long.toString(longValue);

        // Alternatively, using String.valueOf()
        // String strValue = String.valueOf(longValue);

        System.out.println("Original long value: " + longValue);
        System.out.println("Converted String value: " + strValue);
    }
}
