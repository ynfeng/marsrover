/**
 * @author fynwin@gmail.com
 */
public class WestForwardAction extends Action{
    public WestForwardAction(Position position) {
        super(position);
    }

    @Override
    public Position doAction(MarsRover marsRover) {
        if(marsRover.position().x() - 1 < 0){
            return position;
        }
        return position.subX(1);
    }
}
