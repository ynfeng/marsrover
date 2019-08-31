/**
 * @author fynwin@gmail.com
 */
public class ForwardCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
       marsRover.forward();
    }
}
