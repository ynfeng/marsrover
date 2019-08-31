/**
 * @author fynwin@gmail.com
 */
public interface Command {

    static Command forwardCommand(MarsRover marsRover) {
        return new ForwardCommand(marsRover);
    }

    void execute();
}
