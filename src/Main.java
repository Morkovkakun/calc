import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> listOfOperationsCharFORM = new ArrayList<>();
        ArrayList<Character> listOfNumbersCharFORM = new ArrayList<>();
        ArrayList<Integer> ListOfNumbersINTEGERFORM = new ArrayList<>();

        int Result = 0;

        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a expression: ");
        input = sc.nextLine();

        char[] convertAllToChar = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {

            if (convertAllToChar[i] == '+') {
                listOfOperationsCharFORM.add(convertAllToChar[i]);
            }
            if (convertAllToChar[i] == '-') {
                listOfOperationsCharFORM.add(convertAllToChar[i]);
            }
            if (convertAllToChar[i] == '*') {
                listOfOperationsCharFORM.add(convertAllToChar[i]);
            }
            if (convertAllToChar[i] == '/') {
                listOfOperationsCharFORM.add(convertAllToChar[i]);
            }
            if (Character.isDigit(convertAllToChar[i])) {
                listOfNumbersCharFORM.add(convertAllToChar[i]);
            }

        }

        for (Character a : listOfNumbersCharFORM) {

            Integer i = Integer.parseInt(a.toString());
            ListOfNumbersINTEGERFORM.add(i);

        }

        // 1 + 2
        // 1 2 +

        if (ListOfNumbersINTEGERFORM.size() == (listOfOperationsCharFORM.size() + 1)) {

            for (int i = 0; i < listOfOperationsCharFORM.size(); i++) {

                if (listOfOperationsCharFORM.get(i) == '+') if (i == 0) {
                    Result = Result + ListOfNumbersINTEGERFORM.get(i) + ListOfNumbersINTEGERFORM.get(i + 1);
                }
                if (listOfOperationsCharFORM.get(i) == '-') if (i == 0) {
                    Result = Result + ListOfNumbersINTEGERFORM.get(i) - ListOfNumbersINTEGERFORM.get(i + 1);
                }
                if (listOfOperationsCharFORM.get(i) == '*') if (i == 0) {
                    Result = Result + ListOfNumbersINTEGERFORM.get(i) * ListOfNumbersINTEGERFORM.get(i + 1);
                }
                if (listOfOperationsCharFORM.get(i) == '/') if (i == 0) {
                    Result = Result + ListOfNumbersINTEGERFORM.get(i) / ListOfNumbersINTEGERFORM.get(i + 1);
                }
                else {
                    Result = Result + ListOfNumbersINTEGERFORM.get(i + 1);
                }

            }

        }
        System.out.print("Exit: " + Result);
    }

}
