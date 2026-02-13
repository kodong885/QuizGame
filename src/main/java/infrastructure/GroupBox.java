package infrastructure;

import domain.Group;

import java.util.*;


public class GroupBox {

    List<Group> groups = new ArrayList<>();

    public void setGroups(int groupNum) {
        List<Group> groups = new ArrayList<>();
        for (Long i = 1L; i <= groupNum; i++) {
            Group group = new Group(i);
            groups.add(group);
        }
        this.groups = groups;
    }

    public HashMap<Integer, Long> setGroupsOrder(int groupNum) {
        Collections.shuffle(this.groups);
        for (int i = 0; i < groupNum; i++) {
            // i : Each group's order
            Group group = groups.get(i);
            group.setOrder(i+1);
            groups.set(i, group);
        }

        HashMap<Integer, Long> groupsOrder = new HashMap<>(); // HashMap<Group's Order, Group's id>
        for (Integer i = 0; i < groupNum; i++) {
            groupsOrder.put(i+1, groups.get(i).getId());
        }

        // Now the ArrayList(groups) : sequential by its index (= order)
        return groupsOrder;
    }

    public void addGroupPoint(int currentOrder, int quizPoint) {
        groups.get(currentOrder).addPoint(quizPoint);
    }

    public List<Group> whoIsWinner() {

        int[] groupPoints = new int[groups.size()];
        for (int i = 0; i < groups.size(); i++) {
            groupPoints[i] = groups.get(i).getPoint();
        }

        int winnerPoint = Arrays.stream(groupPoints).max().getAsInt();

        List<Group> winners = new ArrayList<>();

        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getPoint() == winnerPoint) {
                winners.add(groups.get(i));
            }
        }

        return winners;
    }

}

