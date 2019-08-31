/**
 * @author fynwin@gmail.com
 */
public class NorthForwardAction extends ForwardAction {
    public NorthForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position forward() {
        return position.plusY(1);
    }
}
