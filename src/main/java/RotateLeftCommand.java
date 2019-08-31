/**
 * @author fynwin@gmail.com
 */
public class RotateLeftCommand implements Command {
    private final MarsRover marsRover;

    public RotateLeftCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.rotateLeft();
    }
}
