import application.GameService;
import application.GameSettingService;
import domain.Group;
import domain.Quiz;
import domain.QuizId;
import infrastructure.GroupBox;
import infrastructure.QuizBox;
import presentation.GameMessage;
import presentation.GetUserInput;
import utils.Answer;

import java.util.HashMap;
import java.util.List;


public class QuizGame {
    public static void main(String[] args) {

        GameMessage message = new GameMessage();
        GetUserInput userInput = new GetUserInput();
        GroupBox groupBoxes = new GroupBox();
        QuizBox quizBoxes = new QuizBox();
        GameSettingService settingService = new GameSettingService(groupBoxes, quizBoxes);

        message.enterGroupNum();
        int groupNum = userInput.enterGroupNum();
        settingService.setGroup(groupNum);

        // HashMap<Group's order, Group's id>
        HashMap<Integer, Long> groupsOrder = settingService.setOrder(groupNum);
        message.tellGroupOrder(groupsOrder, groupNum);

        GameService service = new GameService(groupBoxes, quizBoxes);
        int currentOrder = 1;
        boolean isRunning = true;
        while (isRunning) {
            message.tellCurrentOrder(currentOrder, groupsOrder);
            message.chooseQuiz();

            QuizId quizId;
            Quiz quiz;
            while (true) {
                quizId = userInput.selectQuizId();
                try {
                    quiz = service.findQuiz(quizId);
                    message.presentQuiz(quiz);
                    break;
                } catch (NullPointerException e) {
                    System.out.println(String.format("---- %s(quizId) is already selected ----", quizId.toString()));
                    System.out.println("---- Try again ----");
                } catch (Exception e) {
                    System.out.println("Something is went wrong");
                }
            }

            Answer enteredAnswer = userInput.enterQuizAnswer();
            Boolean accuracy = service.verifyQuizAnswer(quiz, enteredAnswer);

            if (accuracy) {
                message.sayCorrect(currentOrder, groupsOrder);
                service.addGroupPoint(currentOrder, quiz);
            } else {
                message.sayIncorrect(currentOrder, groupsOrder);
            }
            // update order ( currentOrder +1 )
            currentOrder = service.updateCurrentOrder(currentOrder, groupNum);
            // remove selected quiz
            service.removeSelectedQuiz(quizId);

            // Check whether quiz box is empty
            if (service.checkIsQuizBoxEmpty()) {
                List<Group> winners = service.whoIsWinner();
                message.congratulateWinner(winners);
                break;
            }

        }

    }
}


