public class BackwardAction {
    private final Position position;

    public BackwardAction(Position position) {
        this.position = position;
    }

    public static BackwardAction createBackwardAction(Position position) {
        return new BackwardAction(position);
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
