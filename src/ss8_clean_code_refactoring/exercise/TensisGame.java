package ss8_clean_code_refactoring.exercise;

public class TensisGame {
    public static String getScore(String playerOne, String playerTwo, int playerOneScore, int playerTwoScore) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (playerOneScore == playerTwoScore) {
            switch (playerOneScore) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
            int minusResult = playerOneScore - playerTwoScore;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = playerOneScore;
                else {
                    score.append("-");
                    tempScore = playerTwoScore;
                }
                switch (tempScore) {
                    case 0:
                        score.append(" Love");
                        break;
                    case 1:
                        score.append(" Fifteen");
                        break;
                    case 2:
                        score.append(" Thirty");
                        break;
                    case 3:
                        score.append(" Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
