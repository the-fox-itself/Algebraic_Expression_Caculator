package Libraries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {
    public static boolean isDigit(String line) {
        try {
            Integer.parseInt(line);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String readLine() {
        String returnString = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            returnString = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnString;
    }

    public static double evaluateNumberExpression(String expression) {
        double result = 0;



        return result;
    }

    public static String simplifyAlgebraicExpression(String expression) {
        String simplifiedExpression = "";



        return simplifiedExpression;
    }

    public static String factoriseAlgebraicExpression(String expression) {
        String factorisedExpression = "";



        return factorisedExpression;
    }
}
