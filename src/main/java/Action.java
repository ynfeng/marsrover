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

    public static Action createBackwardAction(Position position) {
        switch (position.direction()) {
            case EAST:
                return new EastBackwardAction(position);
            case WEST:
                return new WestBackwardAction(position);
            case NORTH:
                return new NorthBackwardAction(position);
            case SOUTH:
                return new SouthBackwardAction(position);
            default:
                throw new IllegalStateException("Invalid direction");
        }
    }

    public static Action createRotateLeftAction(Position position) {
        switch (position.direction()) {
            case EAST:
            case WEST:
            case NORTH:
                return new NorthRotateLeftAction(position);
            case SOUTH:
                return new SouthRotateLeftAction(position);
            default:
                throw new IllegalStateException("Invalid direction");
        }
    }

    abstract Position doAction();
}
