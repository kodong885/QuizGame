package presentation;

import domain.QuizId;
import utils.Answer;

import java.util.InputMismatchException;
import java.util.Scanner;


public class GetUserInput {

    Scanner sc;

    public GetUserInput() {
        this.sc = new Scanner(System.in);
    }

    public int enterGroupNum() {
        // This game is limited to 10 players.
        int groupNum;
        while (true) {
            try {
                groupNum = sc.nextInt();
                sc.nextLine();
                if (groupNum <= 10) {
                    return groupNum;
                } else {
                    System.out.println("---- Please enter a number of 10 or fewer");
                }

            } catch (Exception e) {
                System.out.println("---- Try again ----");
            }
        }


    }

    public QuizId selectQuizId() {
        while (true) {
            String quizId = sc.nextLine();
            switch (quizId) {
                case "A" : return QuizId.A;
                case "B" : return QuizId.B;
                case "C" : return QuizId.C;
                case "D" : return QuizId.D;
                case "E" : return QuizId.E;
                case "F" : return QuizId.F;
                case "G" : return QuizId.G;
                case "H" : return QuizId.H;
                case "I" : return QuizId.I;
                case "J" : return QuizId.J;
                case "K" : return QuizId.K;
                case "L" : return QuizId.L;
                case "M" : return QuizId.M;
                case "N" : return QuizId.N;
                case "O" : return QuizId.O;
                case "P" : return QuizId.P;
                case "Q" : return QuizId.Q;
                case "R" : return QuizId.R;
                case "S" : return QuizId.S;
                case "T" : return QuizId.T;
                case "U" : return QuizId.U;
                case "V" : return QuizId.V;
                case "W" : return QuizId.W;
                case "X" : return QuizId.X;
                case "Y" : return QuizId.Y;
                case "Z" : return QuizId.Z;
                default:
                    System.out.println("---- Try again ----");
            }
        }
    }

    public Answer enterQuizAnswer() {
        while (true) {
            String answer = sc.nextLine();

            boolean isY = answer.equals("O") || answer.equals("o"); // O
            boolean isN = answer.equals("X") || answer.equals("x"); // X

            if (isY) {
                return Answer.O;
            } else if (isN) {
                return Answer.X;
            } else {
                System.out.println("---- Try Again ----");
            }
        }

    }

}
