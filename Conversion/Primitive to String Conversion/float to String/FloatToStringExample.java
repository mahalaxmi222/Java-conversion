public class FloatToStringExample {
    public static void main(String[] args) {
        // float to String conversion
        float floatValue = 2.718f;

        // Using Float.toString()
        String strValue = Float.toString(floatValue);

        // Alternatively, using String.valueOf()
        // String strValue = String.valueOf(floatValue);

        System.out.println("Original float value: " + floatValue);
        System.out.println("Converted String value: " + strValue);
    }
}
