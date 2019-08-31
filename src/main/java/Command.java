/**
 * @author fynwin@gmail.com
 */
public interface Command {

    static Command forwardCommand() {
        return new ForwardCommand();
    }

    static Command backwardCommand() {
        return new BackwardCommand();
    }

    static Command rotateRightCommand() {
        return new RotateRightCommand();
    }

    static Command rotateLeftCommand() {
        return new RotateLeftCommand();
    }

    void execute(MarsRover marsRover);
}
