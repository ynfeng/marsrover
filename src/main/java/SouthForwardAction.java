/**
 * @author fynwin@gmail.com
 */
public class SouthForwardAction extends Action{
    public SouthForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction() {
        return position.subY(1);
    }
}
