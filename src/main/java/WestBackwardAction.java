/**
 * @author fynwin@gmail.com
 */
public class WestBackwardAction extends Action{
    @Override
    public Position doAction(MarsRover marsRover) {
        return position.plusX(1);
    }

    public WestBackwardAction(Position position) {
        super(position);
    }
}
