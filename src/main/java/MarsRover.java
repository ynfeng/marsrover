/**
 * @author fynwin@gmail.com
 */
public class MarsRover {

    private Area workArea;
    private Position position;

    public void deploy(Position position) {
        this.position = position;
    }

    public void workRage(Area workArea) {
        this.workArea = workArea;
    }

    public Area workRage() {
        return workArea;
    }

    public Position position() {
        return position;
    }

    public Position forward() {
        switch (position.direction()) {
            case EAST:
                position = position.plusX(1);
                break;
            case WEST:
                position = position.subX(1);
                break;
        }
        return position;
    }

    public Position backward() {
        switch (position.direction()) {
            case EAST:
                position = position.subX(1);
                break;
            case WEST:
                position = position.plusX(1);
                break;
        }
        return position;
    }
}
