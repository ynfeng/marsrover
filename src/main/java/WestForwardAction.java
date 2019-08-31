/**
 * @author fynwin@gmail.com
 */
public class WestForwardAction extends Action{
    public WestForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction() {
        return position.subX(1);
    }
}
