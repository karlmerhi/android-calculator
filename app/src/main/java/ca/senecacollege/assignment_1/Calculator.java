package ca.senecacollege.assignment_1;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Calculator {

    static ArrayList<Character> arrayList;

    void push(@NonNull String value) {

        arrayList = new ArrayList<Character>();

        for (char ch : value.toCharArray()) {
            arrayList.add(ch);
        }
    }

    int calculate() throws Exception {
        char first_number = 0;
        char second_number = 0;
        char operator = 0;
        int result = 0;

        if (arrayList.size() < 3 || arrayList.size() % 2 == 0) {
            throw new Exception("Not an Operator");
        }

        for (int i = 0; i <= arrayList.size(); i++) {

            if (i == 0) {
                first_number = arrayList.get(0);
                operator = arrayList.get(1);
                second_number = arrayList.get(2);

                result = Character.getNumericValue(first_number);

                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);

            } else {
                operator = arrayList.get(0);
                second_number = arrayList.get(1);

                arrayList.remove(0);
                arrayList.remove(0);
            }

            if (!Character.isDigit(operator) && Character.isDigit(first_number) && Character.isDigit(second_number)) {
                switch (operator) {
                    case '+':
                        result += Character.getNumericValue(second_number);
                        break;
                    case '-':
                        result -= Character.getNumericValue(second_number);
                        break;
                    case '*':
                        result *= Character.getNumericValue(second_number);
                        break;
                    case '/':
                        result /= Character.getNumericValue(second_number);
                        break;
                    default:
                        throw new Exception("Not an Operator");
                }
            } else {
                throw new Exception("Not an Operator");
            }
        }
        return result;
    }
}
