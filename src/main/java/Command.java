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

    void execute();
}
