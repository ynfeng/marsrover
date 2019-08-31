/**
 * @author fynwin@gmail.com
 */
public abstract class Action {
    protected final Position position;

    public Action(Position position) {
        this.position = position;
    }

    static Action createForwardAction(Position position) {
        switch (position.direction()) {
            case EAST:
                return new EastForwardAction(position);
            case WEST:
                return new WestForwardAction(position);
            case NORTH:
                return new NorthForwardAction(position);
            case SOUTH:
                return new SouthForwardAction(position);
            default:
                throw new IllegalStateException("Invalid direction");
        }
    }

    abstract Position doAction();
}
