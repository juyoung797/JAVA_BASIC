package TIL250612.prisonersdilemma;

public class EighthPlayerFive implements Player {
    private boolean[] opponentHistory;
    private int recordIndex = 0;
    private boolean revengeMode = false;

    public EighthPlayerFive(int maxRounds) {
        this.opponentHistory = new boolean[maxRounds];
    }

    @Override
    public boolean cooperate(int round) {
        if (round == 1 || round == 10) return false; // 1 & 10라운드 확정 배신
        if (round == 2) return true; //2라운드 협력(간보기용)

        int defectCount = 0;    //배신률
        int coopCount = 0;      //협력률
        for (int i = 0; i < round - 1; i++) {
            if (opponentHistory[i]) coopCount++;
            else defectCount++;
        }
        double defectionRate = (double) defectCount / (round - 1);
        double cooperationRate = (double) coopCount / (round - 1);

        // 복수 모드 진입
        if (defectionRate > 0.4) revengeMode = true;

        // 복수 모드 해제 조건: 연속 협력
        if (revengeMode && round >= 3 &&
                opponentHistory[round - 2] && opponentHistory[round - 3]) {
            revengeMode = false;
        }

        // Alternator 대응
        if (revengeMode && round >= 4) {
            boolean a = opponentHistory[round - 2];
            boolean b = opponentHistory[round - 3];
            boolean c = opponentHistory[round - 4];
            if (a != b && c == a) {
                return a;  // Alternator에 동기화
            }
        }

        // 과도한 협력률 탐지 → 배신
        if (cooperationRate >= 0.7) {
            return false;
        }

        // 복수 모드에서는 배신
        if (revengeMode) return false;

        // 기본 전략: Tit-for-Tat
        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory[recordIndex++] = opponentMove;
    }
}
