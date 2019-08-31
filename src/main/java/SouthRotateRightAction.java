/**
 * @author fynwin@gmail.com
 */
public class SouthRotateRightAction extends Action {
    public SouthRotateRightAction(Position position) {
        super(position);
    }

    @Override
    Position doAction(MarsRover marsRover) {
        return Position.of(position.x(), position.y(), Direction.EAST);
    }
}
