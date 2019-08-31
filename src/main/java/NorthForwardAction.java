/**
 * @author fynwin@gmail.com
 */
public class NorthForwardAction extends ForwardAction {
    public NorthForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction() {
        return position.plusY(1);
    }
}
