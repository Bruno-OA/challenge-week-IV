package Question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String operands[];
        String operators[];
        List<Integer> result = new ArrayList<>();
        int testNumber = 1;

        while (sc.hasNext()) {
            int entry = sc.nextInt();

            if (entry != 0) {

                for (int i = 0; i < entry; i++) {
                    String expression = sc.next();
                    operands = expression.split("[+-]");
                    operators = expression.split("[0-9]+");
                    int length = operands.length;

                    if (length == entry) {
                        int agregate = Integer.parseInt(operands[0]);

                        for (int j = 1; j < operands.length; j++) {
                            if (operators[j].equals("+"))
                                agregate += Integer.parseInt(operands[j]);
                            else
                                agregate -= Integer.parseInt(operands[j]);
                        }
                        result.add(agregate);

                    } else {
                        System.out.println("Coloque o numero de entradas correspondentes");
                        break;
                    }
                break;
                }

            }else {
                for (int res : result) {
                    System.out.println("Test" + "-------------" + testNumber);
                    System.out.println(res + "\n");
                    testNumber++;
                }
            }
        }
    }
}
