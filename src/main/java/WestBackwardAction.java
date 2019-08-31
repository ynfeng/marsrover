/**
 * @author fynwin@gmail.com
 */
public class WestBackwardAction extends BackwardAction {
    @Override
    public Position backward() {
        return position.plusX(1);
    }

    public WestBackwardAction(Position position) {
        super(position);
    }
}
