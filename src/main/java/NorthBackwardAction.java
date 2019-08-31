/**
 * @author fynwin@gmail.com
 */
public class NorthBackwardAction extends BackwardAction {
    public NorthBackwardAction(Position position) {
        super(position);
    }

    @Override
    public Position backward() {
        return position.subY(1);
    }
}
