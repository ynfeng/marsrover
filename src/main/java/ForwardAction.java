public class ForwardAction {

    static ForwardAction createForwardAction(Position position) {
        return new ForwardAction();
    }

    public Position forward(Position position) {
        switch (position.direction()) {
            case EAST:
                return position.plusX(1);
            case WEST:
                return position.subX(1);
            case NORTH:
                return position.plusY(1);
            case SOUTH:
                return position.subY(1);
            default:
                return position;
        }
    }


}
