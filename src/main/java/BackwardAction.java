public class BackwardAction {
    private final Position position;

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

    public Position backward() {
        switch (position.direction()) {
            case EAST:
                return position.subX(1);
            case WEST:
                return position.plusX(1);
            case NORTH:
                return position.subY(1);
            case SOUTH:
                return position.plusY(1);
            default:
                throw new IllegalStateException("Invalid direction.");
        }
    }
}
