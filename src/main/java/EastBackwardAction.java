/**
 * @author fynwin@gmail.com
 */
public class EastBackwardAction extends BackwardAction {
    @Override
    public Position backward() {
        return position.subX(1);
    }

    public EastBackwardAction(Position position) {
        super(position);
    }
}
