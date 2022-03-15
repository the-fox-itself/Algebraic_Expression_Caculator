package SimpleOperations;

import java.util.ArrayList;

import static Libraries.Methods.*;

public class Calculator {
    static final int OPERATION_NONE = 0;
    static final int OPERATION_ADDITION = 1;
    static final int OPERATION_SUBTRACTION = 2;

    public static void main(String[] args) {
        String expression = readLine();
        int result = 0;

        String[] characters = expression.split("");
        ArrayList<String> formatted = new ArrayList<>();
        String number = "";
        for (String character : characters) {
            if (!isDigit(character) & !character.equals("+") & !character.equals("-") & !character.equals("*") & !character.equals("/"))
                continue;
            if (isDigit(character)) {
                number += character;
            } else {
                if (!number.equals("")) {           //If there was a number
                    formatted.add(number);          //Add this number to the list
                    number = "";                    //Clear the space for a new number
                    if (character.equals("-")) {    //If current symbol is minus (-)
                        formatted.add("+");         //Add plus (+) to the list
                    }
                }
                if (character.equals("-")) {
                    number += character;
                } else if (character.equals("+") | character.equals("*") | character.equals("/")) {
                    formatted.add(character);
                }
            }
        }
        if (!number.equals("")) {
            formatted.add(number);
        }

        System.out.println(formatted);

        for (String element : formatted) {
            if (!isDigit(element)) {
                if (element.equals("*")) {

                }
            }
        }

        for (int i = 0; i < formatted.size(); i++) {
            String element = formatted.get(i);
            if (isDigit(element)) {
                result += Integer.parseInt(element);
            }
        }

        System.out.println(result);
    }
}

/*
6*5+6*4-6
a =


 | character.equals("(") | character.equals(")") | character.equals("^") | character.equals("!") | character.equals("%")
 */