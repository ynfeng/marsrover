/**
 * @author fynwin@gmail.com
 */
public class EastForwardAction extends Action{
    public EastForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction() {
        return position.plusX(1);
    }
}
