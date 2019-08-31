/**
 * @author fynwin@gmail.com
 */
public class Position {
    private final Direction direction;
    private final int x;
    private final int y;

    private Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public static Position of(int x, int y, Direction direction) {
        return new Position(x, y, direction);
    }
}
