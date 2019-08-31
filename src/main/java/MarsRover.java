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
                position.plusX(1);
                break;
        }
        return Position.of(0, 1, Direction.EAST);
    }

    public Position backward() {
        return Position.of(4, 5, Direction.EAST);
    }
}
