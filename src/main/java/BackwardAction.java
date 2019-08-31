public abstract class BackwardAction {
    protected final Position position;

    public BackwardAction(Position position) {
        this.position = position;
    }

    public static BackwardAction createBackwardAction(Position position) {
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
                throw new IllegalStateException("Invalid direction.");
        }
    }

    abstract Position backward();
}
