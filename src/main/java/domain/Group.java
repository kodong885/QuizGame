package domain;

import java.util.List;

public class Group {

    private Long id; // group id
    private int point = 0;
    private int order;

    public Group(Long id) {
        this.id = id;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Long getId() {
        return this.id;
    }

    public int getPoint() {
        return this.point;
    }

    public void addPoint(int point) {
        this.point += point;
    }

}
