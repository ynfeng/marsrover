/**
 * @author fynwin@gmail.com
 */
public class BackwardCommand implements Command {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.backward();
    }
}
