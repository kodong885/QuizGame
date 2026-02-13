package application;


import infrastructure.GroupBox;
import infrastructure.QuizBox;

import java.util.HashMap;


public class GameSettingService {

    GroupBox groupBoxes;
    QuizBox quizBoxes;

    public GameSettingService(GroupBox groupBoxes, QuizBox quizBoxes) {
        this.groupBoxes = groupBoxes;
        this.quizBoxes = quizBoxes;
    }

    public void setGroup(int groupNum) {
        this.groupBoxes.setGroups(groupNum);
    }

    public HashMap<Integer, Long> setOrder(int groupNum) {
        HashMap<Integer, Long> groupsOrder = this.groupBoxes.setGroupsOrder(groupNum);
        return groupsOrder;
    }

}

