package domain;

import utils.Answer;

public class Quiz {
    private QuizId id;
    private String quiz; // quiz content
    private Answer answer;
    private int point;

    public Quiz(QuizId id, String quiz, Answer answer, int point) {
        switch (id) {
            case A -> this.id = QuizId.A;
            case B -> this.id = QuizId.B;
            case C -> this.id = QuizId.C;
            case D -> this.id = QuizId.D;
            case E -> this.id = QuizId.E;
            case F -> this.id = QuizId.F;
            case G -> this.id = QuizId.G;
            case H -> this.id = QuizId.H;
            case I -> this.id = QuizId.I;
            case J -> this.id = QuizId.J;
            case L -> this.id = QuizId.L;
            case M -> this.id = QuizId.M;
            case N -> this.id = QuizId.N;
            case O -> this.id = QuizId.O;
            case P -> this.id = QuizId.P;
            case Q -> this.id = QuizId.Q;
            case R -> this.id = QuizId.R;
            case S -> this.id = QuizId.S;
            case T -> this.id = QuizId.T;
            case U -> this.id = QuizId.U;
            case V -> this.id = QuizId.V;
            case W -> this.id = QuizId.W;
            case X -> this.id = QuizId.X;
            case Y -> this.id = QuizId.Y;
            case Z -> this.id = QuizId.Z;
        }
        this.quiz = quiz;
        this.answer = answer;
        this.point = point;
    }

    public String getQuizContent() {
        return this.quiz;
    }

    public int getPoint() {
        return this.point;
    }

    public Answer getAnswer() {
        return this.answer;
    }

}