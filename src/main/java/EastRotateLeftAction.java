/**
 * @author fynwin@gmail.com
 */
public class EastRotateLeftAction extends Action {
    public EastRotateLeftAction(Position position) {
        super(position);
    }

    @Override
    Position doAction(MarsRover marsRover) {
        return Position.of(position.x(), position.y(), Direction.NORTH);
    }


}
