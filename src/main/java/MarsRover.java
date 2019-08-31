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
            case NORTH:
                position = position.plusY(1);
                break;
            case SOUTH:
                position = position.subY(1);
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
            case NORTH:
                position = position.subY(1);
                break;
            case SOUTH:
                position = position.plusY(1);
                break;
        }
        return position;
    }

    public Position rotateLeft() {
        switch (position.direction()) {
            case SOUTH:
                position = Position.of(position.x(), position.y(), Direction.WEST);
                break;
            case WEST:
                position = Position.of(position.x(), position.y(), Direction.NORTH);
                break;
            case NORTH:
                position = Position.of(position.x(), position.y(), Direction.EAST);
                break;
            case EAST:
                position = Position.of(position.x(), position.y(), Direction.SOUTH);
                break;
        }
        return position;
    }

    public Position rotateRight() {
        switch (position.direction()){
            case SOUTH:
                position = Position.of(position.x(), position.y(), Direction.EAST);
                break;
        }
        return position;
    }
}
