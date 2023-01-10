package stringCalculator;

public class StringCalculator {

    public static float countString(String str) {
        String lastElement = str.substring(str.length() - 1);
        if (!lastElement.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            str = removeLastElementFromString(str);
        }
        String[] list = str.split(";|,|\\.");
        return calculatingResult(list, lastElement);
    }

    private static String removeLastElementFromString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    private static float calculatingResult(String[] list, String lastElement) {
        float result = Float.parseFloat(list[0]);
        for (int i = 1; i < list.length; i++) {
            if (!list[i].startsWith("-")) {
                list[i] = list[i].replaceAll("[^\\d.]", "");
            }
            float number = Float.parseFloat(list[i]);
            if (Float.parseFloat(list[i]) >= 0) {
                switch (lastElement) {
                    case "+" -> result = addition(result, number);
                    case "-" -> result = subtraction(result, number);
                    case "*" -> result = multiplication(result, number);
                    case "/" -> result = division(result, number);
                    default -> result = 0;
                };
            } else {
                switch (lastElement) {
                    case "+" -> result = addition(result, (number));
                    case "-" -> result = subtraction(result, (number));
                    case "*" -> result = multiplication(result, (number));
                    case "/" -> result = division(result, (number));
                    default -> result = 0;
                };
            }
        }
        return result;
    }

    private static float addition(float result, float number) {
        return result + number;
    }

    private static float subtraction(float result, float number) {
        return result - number;
    }

    private static float multiplication(float result, float number) {
        return result * number;
    }

    private static float division(float result, float number) {
        return result / number;
    }
}

