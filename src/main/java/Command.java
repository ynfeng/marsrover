/**
 * @author fynwin@gmail.com
 */
public interface Command {

    static Command forwardCommand(MarsRover marsRover) {
        return new ForwardCommand(marsRover);
    }

    static Command backwardCommand(MarsRover marsRover) {
        return new BackwardCommand(marsRover);
    }

    static Command rotateRightCommand(MarsRover marsRover) {
        return new RotateRightCommand(marsRover);
    }

    void execute();
}
