/**
 * @author fynwin@gmail.com
 */
public class WestRotateLeftAction extends Action {
    public WestRotateLeftAction(Position position) {
        super(position);
    }

    @Override
    Position doAction(MarsRover marsRover) {
        return Position.of(position.x(), position.y(), Direction.SOUTH);
    }
}
