import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class PosistionSensorTest {

    @Test
    public void should_detection_work_area() {
        PosistionSensor posistionSensor = new PosistionSensor();
        boolean result = posistionSensor.isInWorkArea(Area.of(10, 10), Position.of(2, 3, Direction.WEST));
        assertThat(result, is(true));

        result = posistionSensor.isInWorkArea(Area.of(10, 10), Position.of(11, 10, Direction.WEST));
        assertThat(result, is(false));
    }

}
