/**
 * @author fynwin@gmail.com
 */
public class SouthForwardAction extends ForwardAction {
    public SouthForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position forward() {
        return position.subY(1);
    }
}
