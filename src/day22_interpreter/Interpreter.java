package day22_interpreter;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 解释器：
 */
public class Interpreter {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String expStr = getExpStr();
        System.out.println(expStr);
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println(expStr + " = " + calculator.run(var));
    }

    private static HashMap<String, Integer> getValue(String expStr) throws Exception {
        HashMap<String, Integer> map = new HashMap<>();
        for (char c : expStr.toCharArray()) {
            if (c!='+' && c!='-') {
                System.out.print("please input value of " + c + ": ");
                map.put(String.valueOf(c), scanner.nextInt());
            }
        }
        return map;
    }

    private static String getExpStr() throws Exception {
        System.out.print("please input expression: ");
        return scanner.next();
    }
}
