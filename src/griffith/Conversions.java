package griffith;

public class Conversions {

    // Convert Euro to Dollar
    public static double euroToDollar(double euro) {
    	return euro * 1.1; // Stub
    }

    // Convert Dollar to Euro
    public static double dollarToEuro(double dollar) {
    	return dollar * 0.91; // Stub
    }

    // Convert String to Integer
    public static int stringToInteger(String val) {
    	return Integer.parseInt(val); // Stub
    }

    // Convert Integer to String
    public static String integerToString(int val) {
    	return String.valueOf(val); // Stub
    }

    // Switch case of a given string (uppercase to lowercase and vice versa)
    public static String switchCase(String input) {
    	StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

