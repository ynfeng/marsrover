public class ForwardAction {

    protected  final Position position;

    public ForwardAction(Position position) {
        this.position = position;
    }

    static ForwardAction createForwardAction(Position position) {
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

    public Position forward() {
        switch (position.direction()) {
            case WEST:
            case NORTH:
            case SOUTH:
            default:
                return position;
        }
    }


}
