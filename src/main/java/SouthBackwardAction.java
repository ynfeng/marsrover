/**
 * @author fynwin@gmail.com
 */
public class SouthBackwardAction extends Action{
    public SouthBackwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction() {
        return position.plusY(1);
    }
}
