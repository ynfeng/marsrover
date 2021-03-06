import java.util.List;

/**
 * @author fynwin@gmail.com
 */
public class MarsRover {

    private Area workArea;
    private Position position;
    private final PosistionSensor posistionSensor = new PosistionSensor();

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
        Position newPosition = forwardAction.doAction(this);
        position = posistionSensor.isInWorkArea(workArea, newPosition)
            ? newPosition
            : position;
        return position;
    }

    public Position backward() {
        Action backwardAction = Action.createBackwardAction(position);
        Position newPosition = backwardAction.doAction(this);
        position = posistionSensor.isInWorkArea(workArea, newPosition)
            ? newPosition
            : position;
        return position;
    }

    public Position rotateLeft() {
        Action rotateLeftAction = Action.createRotateLeftAction(position);
        position = rotateLeftAction.doAction(this);
        return position;
    }

    public Position rotateRight() {
        Action rotateRightAction = Action.createRotateRightAction(position);
        position = rotateRightAction.doAction(this);
        return position;
    }

    public Position executeBatchCommand(List<Command> commands) {
        commands.forEach(command -> command.execute(this));
        return position;
    }
}
