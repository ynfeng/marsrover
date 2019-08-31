/**
 * @author fynwin@gmail.com
 */
public class RotateLeftCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.rotateLeft();
    }
}
