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
        return Position.of(0, 1, Direction.WEST);
    }
}
