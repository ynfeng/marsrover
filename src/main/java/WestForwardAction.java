/**
 * @author fynwin@gmail.com
 */
public class WestForwardAction extends ForwardAction {
    public WestForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position forward() {
        return position.subX(1);
    }
}
