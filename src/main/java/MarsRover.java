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
        ForwardAction forwardAction = ForwardAction.createForwardAction(position);
        position = forwardAction.forward();
        return position;
    }

    public Position backward() {
        BackwardAction backwardAction = BackwardAction.createBackwardAction(position);
        position = backwardAction.backward();
        return position;
    }

    public Position rotateLeft() {
        switch (position.direction()) {
            case SOUTH:
                position = Position.of(position.x(), position.y(), Direction.WEST);
                break;
            case WEST:
                position = Position.of(position.x(), position.y(), Direction.SOUTH);
                break;
            case NORTH:
                position = Position.of(position.x(), position.y(), Direction.WEST);
                break;
            case EAST:
                position = Position.of(position.x(), position.y(), Direction.NORTH);
                break;
        }
        return position;
    }

    public Position rotateRight() {
        switch (position.direction()) {
            case SOUTH:
                position = Position.of(position.x(), position.y(), Direction.EAST);
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
