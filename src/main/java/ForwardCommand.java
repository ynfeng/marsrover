/**
 * @author fynwin@gmail.com
 */
public class ForwardCommand implements Command {
    private final MarsRover marsRover;

    public ForwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
       marsRover.forward();
    }
}
