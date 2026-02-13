package application;


import domain.Group;
import domain.Quiz;
import domain.QuizId;
import infrastructure.GroupBox;
import infrastructure.QuizBox;
import utils.Answer;

import java.util.List;

public class GameService {

    GroupBox groupBoxes;
    QuizBox quizBoxes;

    public GameService(GroupBox groupBoxes, QuizBox quizBoxes) {
        this.groupBoxes = groupBoxes;
        this.quizBoxes = quizBoxes;
    }

    public Quiz findQuiz(QuizId id) {
        return quizBoxes.findQuiz(id);
    }

    /*
    This method returns true if the enteredAnswer is equals with the answer of the quiz.
     */
    public Boolean verifyQuizAnswer(Quiz quiz, Answer enteredAnswer) {
        return quiz.getAnswer().equals(enteredAnswer);
    }

    public void addGroupPoint(int currentOrder, Quiz quiz) {
        int quizPoint = quiz.getPoint();
        groupBoxes.addGroupPoint(currentOrder, quizPoint);
    }

    public void removeSelectedQuiz(QuizId id) {
        quizBoxes.removeSelectedQuiz(id);
    }

    public Boolean checkIsQuizBoxEmpty() {
        return quizBoxes.checkIsQuizEmpty();
    }

    public int updateCurrentOrder(int currentOrder, int groupNum) {
        // 무조건 1 이상 groupNum 이하 만큼의 숫자 반환.
        currentOrder += 1;
        currentOrder = currentOrder % groupNum;
        if (currentOrder == 0) {
            currentOrder = groupNum;
        }
        return currentOrder;
    }

    public List<Group> whoIsWinner() {
        return groupBoxes.whoIsWinner();
    }

}
