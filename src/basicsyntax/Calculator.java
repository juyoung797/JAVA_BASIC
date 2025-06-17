package basicsyntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    static boolean isFinished = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        double num;
        double num2;

        ArrayList<Character> list;
        list = new ArrayList<>(Arrays.asList('+', '-', '*', '/', '%', '^'));

        System.out.println("+++ 계산기 프로그램 +++");

        while (!isFinished) {
            System.out.print("숫자를 입력하세요 : ");
            num = sc.nextDouble();
            while (true) {
                System.out.print("+, -, *, /, %, ^ 연산자를 입력하세요 : ");
                operator = sc.next().charAt(0);

                if (list.contains(operator)) {
                    break;
                } else {
                    System.out.println("잘못된 연산자입니다. 다시 입력해주세요.");
                }
            }
            System.out.print("다음 숫자를 입력하세요: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    num += num2;
                    break;
                case '-':
                    num -= num2;
                    break;
                case '*':
                    num *= num2;
                    break;
                case '/':
                    num /= num2;
                    break;
                case '%':
                    num %= num2;
                    break;
                case '^':
                    num = Math.pow(num, num2);
                    break;
            }
            System.out.println("결과입니다: " + num);
            isValid(sc);
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
    public static void isValid(Scanner sc){
        System.out.println("종료하시려면 q를 입력해주세요.");
        sc.nextLine();
        String input = sc.nextLine();
        isFinished = input.equals("q");
    }
}
