package prisonersdilemma;

public class EighthPlayerSix implements Player {
    boolean[] opponentHistory;
    int recordIndex = 0;

    public EighthPlayerSix(int maxRounds) {
        this.opponentHistory = new boolean[10];
    }

    @Override
    public boolean cooperate(int round) {
        if (round <= 2) {
            return true;
        }else if (round <= 8) {
            return opponentHistory[round - 2];}
        else
            return false;
    }

    @Override
    public void recordOpponentMove(boolean opponentMove) {
        opponentHistory[recordIndex++] = opponentMove;
    }
}