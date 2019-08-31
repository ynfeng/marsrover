/**
 * @author fynwin@gmail.com
 */
public class EastForwardAction extends ForwardAction {
    public EastForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position forward() {
        return position.plusX(1);
    }
}
