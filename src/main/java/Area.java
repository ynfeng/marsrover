/**
 * @author fynwin@gmail.com
 */
public class Area {

    private final int x;
    private final int y;

    private Area(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Area of(int x, int y) {
        return new Area(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Area)) {
            return false;
        }

        Area area = (Area) o;

        if (x != area.x) {
            return false;
        }
        return y == area.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public void workRange() {

    }
}
