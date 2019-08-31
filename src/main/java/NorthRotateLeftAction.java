/**
 * @author fynwin@gmail.com
 */
public class NorthRotateLeftAction extends Action {
    public NorthRotateLeftAction(Position position) {
        super(position);
    }

    @Override
    Position doAction(MarsRover marsRover) {
        return Position.of(position.x(), position.y(), Direction.WEST);
    }
}
