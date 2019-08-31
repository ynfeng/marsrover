/**
 * @author fynwin@gmail.com
 */
public class SouthBackwardAction extends BackwardAction {
    public SouthBackwardAction(Position position) {
        super(position);
    }

    @Override
    public Position backward() {
        return position.plusY(1);
    }
}
