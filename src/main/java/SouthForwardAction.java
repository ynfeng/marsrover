/**
 * @author fynwin@gmail.com
 */
public class SouthForwardAction extends Action{
    public SouthForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction(MarsRover marsRover) {
        return position.subY(1);
    }
}
