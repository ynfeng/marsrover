/**
 * @author fynwin@gmail.com
 */
public class EastBackwardAction extends Action{
    @Override
    public Position doAction(MarsRover marsRover) {
        return position.subX(1);
    }

    public EastBackwardAction(Position position) {
        super(position);
    }
}
