import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class MarsRoverTest {

//    @Test
//    public void testDeploy(){
//        MarsRover marsRover = new MarsRover();
//        marsRover.workRange(Area.of(10,10));
//        marsRover.deploy(Position.of(0,0),"W");
//        marsRover.forward();
//        marsRover.backward();
//        marsRover.rotateLeft();
//        marsRover.rotateRight();
//    }

    @Test
    public void should_override_area_equals() {
        assertThat(Area.of(10, 10), is(Area.of(10, 10)));
    }

    @Test
    public void should_set_work_range() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        assertThat(marsRover.workRage(), is(Area.of(10, 10)));
    }

    @Test
    public void should_deploy_mars_rover() {
        MarsRover marsRover = new MarsRover();
        marsRover.deploy(Position.of(0, 0, Direction.WEST));
        
    }


}
