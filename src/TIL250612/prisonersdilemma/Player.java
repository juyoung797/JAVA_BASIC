package TIL250612.prisonersdilemma;

public interface Player {
    // 나의 값 표시하는 함수
    boolean cooperate(int round);
    // 상대의 이전 값 기록
    void recordOpponentMove(boolean opponentMove);
}
