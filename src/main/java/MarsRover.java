import java.util.List;

/**
 * @author fynwin@gmail.com
 */
public class MarsRover {

    private Area workArea;
    private Position position;

    public void deploy(Position position) {
        this.position = position;
    }

    public void workArea(Area workArea) {
        this.workArea = workArea;
    }

    public Area workArea() {
        return workArea;
    }

    public Position position() {
        return position;
    }

    public Position forward() {
        Action forwardAction = Action.createForwardAction(position);
        position = forwardAction.doAction();
        return position;
    }

    public Position backward() {
        Action backwardAction = Action.createBackwardAction(position);
        position = backwardAction.doAction();
        return position;
    }

    public Position rotateLeft() {
        Action rotateLeftAction = Action.createRotateLeftAction(position);
        position = rotateLeftAction.doAction();
        return position;
    }

    public Position rotateRight() {
        Action rotateRightAction = Action.createRotateRightAction(position);
        switch (position.direction()) {
            case SOUTH:
                position = rotateRightAction.doAction();
                break;
            case EAST:
                position = Position.of(position.x(), position.y(), Direction.SOUTH);
                break;
            case NORTH:
                position = Position.of(position.x(), position.y(), Direction.EAST);
                break;
            case WEST:
                position = Position.of(position.x(), position.y(), Direction.NORTH);
                break;
        }
        return position;
    }

    public Position executeBatchCommand(List<Command> commands) {
        commands.forEach(Command::execute);
        return position;
    }
}
