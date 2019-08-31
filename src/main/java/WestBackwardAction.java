/**
 * @author fynwin@gmail.com
 */
public class WestBackwardAction extends Action{
    @Override
    public Position doAction() {
        return position.plusX(1);
    }

    public WestBackwardAction(Position position) {
        super(position);
    }
}
