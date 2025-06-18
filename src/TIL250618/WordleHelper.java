package TIL250618;

import java.util.Scanner;

public class WordleHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("추측한 단어를 입력하세요: ");
        String guess = scanner.nextLine().trim().toLowerCase();

        System.out.print("결과를 입력하세요 (c: 위치/문자 정확, w: 문자만 정확, n: 없음): ");
        String result = scanner.nextLine().trim().toLowerCase();

        if (guess.length() != 5 || result.length() != 5) {
            System.out.println("오류: 단어와 결과는 반드시 5글자여야 합니다.");
            return;
        }

        StringBuilder finalResult = new StringBuilder();
        StringBuilder misplacedLetters = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char guessChar = guess.charAt(i);
            char resultChar = result.charAt(i);

            if (resultChar == 'c') {
                finalResult.append(guessChar);
            } else {
                finalResult.append('_');
                if (resultChar == 'w') {
                    misplacedLetters.append(guessChar).append(", ");
                }
            }
        }

        System.out.print("결과: " + finalResult);
        if (misplacedLetters.length() > 0) {
            // 마지막 콤마 제거
            misplacedLetters.setLength(misplacedLetters.length() - 2);
            System.out.print("  (w: " + misplacedLetters + ")");
        }

        System.out.println();
        scanner.close();
    }
}
