/**
 * @author fynwin@gmail.com
 */
public class NorthBackwardAction extends Action{
    public NorthBackwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction(MarsRover marsRover) {
        return position.subY(1);
    }
}
