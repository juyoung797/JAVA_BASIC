package prisonersdilemma;
public class EighthPlayerFour implements Player {
    private static final int R = 3; // 둘 다 협력
    private static final int T = 5; // 내가 배신, 상대 협력
    private static final int P = 1; // 둘 다 배신
    private static final int S = 0; // 내가 협력, 상대 배신

    private boolean[] opponentHistory;
    private boolean[] myHistory;
    private int roundCount;
    private int myScore = 0;
    private int opponentScore = 0;

    public EighthPlayerFour(int maxRounds) {
        opponentHistory = new boolean[maxRounds];
        myHistory = new boolean[maxRounds];
        roundCount = 0;
    }
    // 내 전략
    @Override
    public boolean cooperate(int round) {
        roundCount = round;

        if (round == 1) return true; // 첫 라운드는 협력

        // 최근 3라운드 중 2번 이상 배신당했으면 배신
        if (countRecentOpponentBetrayals(3) >= 2) return false;

        // 내가 점수 밀릴 경우 공격 모드 (배신)
        if (myScore < opponentScore) return false;

        // 기본적으로 상대 행동을 따라함 (미러링)
        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        boolean myLastMove = myHistory[roundCount - 1] = (roundCount == 1) ? true : opponentHistory[roundCount - 2];
        opponentHistory[roundCount - 1] = opponentMove;

        // 점수 계산
        if (myLastMove && opponentMove) {
            myScore += R;
            opponentScore += R;
        } else if (myLastMove && !opponentMove) {
            myScore += S;
            opponentScore += T;
        } else if (!myLastMove && opponentMove) {
            myScore += T;
            opponentScore += S;
        } else {
            myScore += P;
            opponentScore += P;
        }
    }

    private int countRecentOpponentBetrayals(int lookback) {
        int count = 0;
        for (int i = Math.max(0, roundCount - lookback); i < roundCount; i++) {
            if (!opponentHistory[i]) count++;
        }
        return count;
    }

    // 디버깅용: 현재 점수 확인
    public int getMyScore() {
        return myScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public String getName() {
        return "AdaptiveExploiter";
    }
}