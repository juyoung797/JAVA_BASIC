package prisonersdilemma;
import java.util.Random;
//스카우터 랜덤 값 주기
public class EighthPlayerTwo implements Player {
    final Random rand = new Random();
    final boolean[] opponentHistory;
    int recordIndex = 0;
    int maxRounds;

    public EighthPlayerTwo(int maxRounds) {
        this.maxRounds = maxRounds;
        this.opponentHistory = new boolean[maxRounds];
    }

    @Override
    public boolean cooperate(int round) {
        return rand.nextBoolean();
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory[recordIndex++] = opponentMove;
    }
}
