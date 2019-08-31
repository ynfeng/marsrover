/**
 * @author fynwin@gmail.com
 */
public class RotateRightCommand implements Command {
    private final MarsRover marsRover;

    public RotateRightCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
       marsRover.rotateRight();
    }
}
