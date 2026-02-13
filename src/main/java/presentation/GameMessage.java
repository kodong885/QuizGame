package presentation;

import domain.Group;
import domain.Quiz;

import java.util.HashMap;
import java.util.List;


public class GameMessage {
    public void enterGroupNum() {
        System.out.println("---- How many group are there? Select group number!!----");
    }

    public void tellGroupOrder(HashMap<Integer, Long> groupsOrder, int groupNum) {
        System.out.println("---- The order of each groups is the following. ----");
        for (int i = 1; i <= groupNum; i++) {
            System.out.println(String.format("%d --> %d group", i, groupsOrder.get(i)));
        }
    }

    public void tellCurrentOrder(int currentOrder, HashMap<Integer, Long> groupsOrder) {
        System.out.println(" "); // /n
        System.out.println(
                String.format("------ (%d) %d group ------",
                currentOrder,
                groupsOrder.get(currentOrder))
        );
    }

    public void presentQuiz(Quiz quiz) {
        System.out.println(String.format("%s -> O or X? ", quiz.getQuizContent()));
    }

    public void chooseQuiz() {
        System.out.println("---- Choose quiz! ----");
    }

    public void sayCorrect(int currentOrder, HashMap<Integer, Long> groupsOrder) {
        System.out.println(String.format("%d got the right answer! (+ point!)", groupsOrder.get(currentOrder)));
    }

    public void sayIncorrect(int currentOrder, HashMap<Integer, Long> groupsOrder) {
        System.out.println(String.format("%d got the wrong answer... (no point)", groupsOrder.get(currentOrder)));
    }

    public void congratulateWinner(List<Group> winners) {
        System.out.println("------------------------");

        if (winners.size() > 1) {
            // joint first place (공동 1등)
            for (Group winner : winners) {
                System.out.println(String.format("%d group", winner.getId()));
            }
            System.out.println(String.format(
                    "joint first place!!, congratulation!! (%d points)",
                    winners.get(0).getPoint())
            );
        } else {
            // first place (1등)
            System.out.println(String.format(
                    "%d group, congratulation!! (%d points)",
                    winners.get(0).getId(),
                    winners.get(0).getPoint())
            );
        }

        System.out.println("------------------------");

    }

}
