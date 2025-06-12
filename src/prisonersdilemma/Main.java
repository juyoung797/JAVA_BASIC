package prisonersdilemma;

public class Main {
    // Payoff 상수 정의
    private static final int R = 3; // 둘 다 협력
    private static final int T = 5; // 나는 배신, 상대방 협력
    private static final int P = 1; // 둘다 배신
    private static final int S = 0; // 나는 협력, 상대방 배신

    public static void game(Player playerA, Player playerB, int rounds) {
         // 라운드 수 고정
        int totalA = 0, totalB = 0;

        for (int round = 1; round <= rounds; round++) {
            boolean choiceA = playerA.cooperate(round);
            boolean choiceB = playerB.cooperate(round);

            // 점수 계산
            if (choiceA && choiceB) { // True && True
                totalA += R;
                totalB += R;
            } else if (choiceA && !choiceB) { // True && False
                totalA += S;
                totalB += T;
            } else if (!choiceA && choiceB) { // False && True
                totalA += T;
                totalB += S;
            } else { // False && False
                totalA += P;
                totalB += P;
            }

            // 상대 움직임 기록
            playerA.recordOpponentMove(choiceB);
            playerB.recordOpponentMove(choiceA);

            System.out.printf(
                "Round %2d: 상대=%s, 나=%s → 점수 A=%d, B=%d%n",
                round,
                choiceA ? "협력" : "배신",
                choiceB ? "협력" : "배신",
                totalA,
                totalB
            );
        }
//        System.out.println("GAME : " + playerA.name + " vs " + playerB.name);
        System.out.println("=== 최종 점수 ===");
        System.out.printf("상대: %d점\n나: %d점%n", totalA, totalB);
    }
    // ▶️ 실행
    public static void main(String[] args) {
        int rounds = 10;
        Player playerA = new EighthPlayer(rounds);
        Player playerB = new EighthPlayerTwo(rounds); // 플레이어끼리 게임
        Player playerC = new EighthPlayerThree(rounds); // 무자비복수
        Player playerD = new EighthPlayerFour(rounds); // 정주영
        Player playerE = new EighthPlayerFive(rounds); // 정지우님 코드
        Player playerG = new EighthPlayerSix(rounds); // 정무현님 코드
        game(playerD, playerE, rounds);
    }
}

//
//public class Main {
//    // Payoff 상수 정의
//    private static final int R = 3; // 둘 다 협력
//    private static final int T = 5; // 나는 배신, 상대방 협력
//    private static final int P = 1; // 둘다 배신
//    private static final int S = 0; // 나는 협력, 상대방 배신
//
//    static Player createPlayer(int index, int rounds) {
//        switch (index){
//            case 0: return new A(rounds);
//            case 1: return new B(rounds);
//            case 2: return new B(rounds);
//            case 3: return new C(rounds);
//            case 4: return new C(rounds);
//            case 5: return new C(rounds);
//            case 6: return new C(rounds);
//            case 7: return new C(rounds);
//            case 8: return new C(rounds);
//            case 9: return new C(rounds);
//
//            default: throw new IllegalArgumentException("found error");
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int n = 10;
//        int rounds = 10; // 라운드 수 고정
//        int[] totalScores = new int[n] ;
//        String[] strategy = {"A","B","C","D","E","F","G","H","I","J"};
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                Player p1 = createPlayer(i, rounds);
//                Player p2 = createPlayer(j, rounds);
//
//                int score1 = 0, score2 = 0;
//
//                for (int round = 1; round <= rounds; round++) {
//                    boolean c1 = p1.cooperate(round);
//                    boolean c2 = p2.cooperate(round);
//
//                    if (c1 && c2) {
//                        score1 += R;
//                        score2 += R;
//                    } else if (c1 && !c2) {
//                        score1 += S;
//                        score2 += T;
//                    } else if (!c1 && c2) {
//                        score1 += T;
//                        score2 += S;
//                    } else {
//                        score1 += P;
//                        score2 += P;
//                    }
//
//                    p1.recordOpponentMove(c2);
//                    p2.recordOpponentMove(c1);
//                }
//
//                totalScores[i] += score1;
//                totalScores[j] += score2;
//
//                System.out.printf("%s %d 대 %s %d \n",strategy[i],score1,strategy[j],score2);
//            }
//        }
//        System.out.println("=== 최종 점수 ===");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Player %s: %d점%n", strategy[i], totalScores[i]);
//        }
//    }
//}