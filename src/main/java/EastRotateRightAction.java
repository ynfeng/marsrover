/**
 * @author fynwin@gmail.com
 */
public class EastRotateRightAction extends Action {
    public EastRotateRightAction(Position position) {
        super(position);
    }

    @Override
    Position doAction(MarsRover marsRover) {
        return Position.of(position.x(), position.y(), Direction.SOUTH);
    }
}
