/**
 * @author fynwin@gmail.com
 */
public class BackwardCommand implements Command {
    private final MarsRover marsRover;

    public BackwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.backward();
    }
}
