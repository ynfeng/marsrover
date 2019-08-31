/**
 * @author fynwin@gmail.com
 */
public class NorthForwardAction extends Action{
    public NorthForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction() {
        return position.plusY(1);
    }
}
