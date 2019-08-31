/**
 * @author fynwin@gmail.com
 */
public class PosistionSensor {

    public boolean isInWorkArea(Area area, Position position) {
        return position.x() >= 0 && position.x() <= area.x()
            && position.y() >= 0 && position.y() <= area.y();
    }
}
