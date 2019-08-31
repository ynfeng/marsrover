/**
 * @author fynwin@gmail.com
 */
public class NorthRotateRightAction extends Action {
    public NorthRotateRightAction(Position position) {
        super(position);
    }

    @Override
    Position doAction() {
        return Position.of(position.x(), position.y(), Direction.EAST);
    }
}
