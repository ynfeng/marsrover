/**
 * @author fynwin@gmail.com
 */
public class WestRotateRightAction extends Action {
    public WestRotateRightAction(Position position) {
        super(position);
    }

    @Override
    Position doAction(MarsRover marsRover) {
        return Position.of(position.x(), position.y(), Direction.NORTH);
    }


}
