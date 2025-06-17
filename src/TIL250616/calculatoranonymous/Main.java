package TIL250616.calculatoranonymous;

interface Calculator {
    int compute(int a, int b);
}
class CalculatorMachine implements Calculator {
    @Override
    public int compute(int a, int b) {
        return a * b;
    }
}
public class Main {
    public static void main(String[] args) {
        // 1. 간단하게 기능을 구현해서 바로 테스트 하려면 anonymous class를 사용하면 된다.
        Calculator multiply = new Calculator() {
            public int compute(int a, int b) {
                return a * b;
            }
        };
        Calculator add = new Calculator() {
            public int compute(int a, int b) {
                return a + b;
            }
        };
        Calculator connectNum = new Calculator() {
            public int compute(int a, int b) {
                return Integer.parseInt("" + a + b);
            }
        };
        System.out.println(multiply.compute(3, 4));
        System.out.println(add.compute(3, 4));
        System.out.println(connectNum.compute(3, 4));

        // 2. 만약 기능을 여러 번 사용하고 싶으면 class에 implement 해서 그 instance 를 가지고 실행시키는 것이 낫다.
        CalculatorMachine machine = new CalculatorMachine();
        System.out.println(machine.compute(1, 2));
        System.out.println(machine.compute(10, 20));
    }
}
