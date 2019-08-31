/**
 * @author fynwin@gmail.com
 */
public class SouthRotateLeftAction extends Action {
    public SouthRotateLeftAction(Position position) {
        super(position);
    }

    @Override
    Position doAction() {
        return Position.of(position.x(), position.y(), Direction.WEST);
    }
}
