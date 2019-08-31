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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Position)) {
            return false;
        }

        Position position = (Position) o;

        if (x != position.x) {
            return false;
        }
        if (y != position.y) {
            return false;
        }
        return direction == position.direction;
    }

    @Override
    public int hashCode() {
        int result = direction.hashCode();
        result = 31 * result + x;
        result = 31 * result + y;
        return result;
    }
}
