/**
 * @author fynwin@gmail.com
 */
public class RotateRightCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
       marsRover.rotateRight();
    }
}
