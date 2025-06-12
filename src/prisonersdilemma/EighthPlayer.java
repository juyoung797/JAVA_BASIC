package prisonersdilemma;
// Tit-for-Tat 눈에는 눈 이에는 이
public class EighthPlayer implements Player {
    final boolean[] opponentHistory;
    private int recordIndex = 0;
    private boolean betrayedBefore = false;

    /**
     * @param maxRounds 전체 라운드 수
     */
    public EighthPlayer(int maxRounds) {
        this.opponentHistory = new boolean[maxRounds];
        // 배열 기본값은 false
    }

    @Override
    public boolean cooperate(int round) {
        if (round == 1) {
            return true; // 첫 라운드는 무조건 협력
        }
        // 이전 라운드의 상대 선택을 그대로 따라 함
        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        // 호출 순서대로 배열에 기록
        opponentHistory[recordIndex++] = opponentMove;
    }


    // 상대와 나의 점수를 비교하는 함수
//    public void comparePayoffs () {
//        int totalA = 0, totalB = 0;
//
//        for (int round = 1; round <= rounds; round++) {
//            boolean choiceA = playerA.cooperate(round);
//            boolean choiceB = playerB.cooperate(round);
//
//            // 점수 계산
//            if (choiceA && choiceB) { // True && True
//                totalA += R;
//                totalB += R;
//            } else if (choiceA && !choiceB) { // True && False
//                totalA += S;
//                totalB += T;
//            } else if (!choiceA && choiceB) { // False && True
//                totalA += T;
//                totalB += S;
//            } else { // False && False
//                totalA += P;
//                totalB += P;
//            }
//
//            // 상대 움직임 기록
//            playerA.recordOpponentMove(choiceB);
//            playerB.recordOpponentMove(choiceA);
//    }
//}


}
