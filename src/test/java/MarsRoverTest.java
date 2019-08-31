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
    public void should_set_work_range() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRange(Area.of(10, 10));
        assertThat(ma, is())
    }

    @Test
    public void should_deploy_mars_rover(){
        MarsRover marsRover = new MarsRover();
        marsRover.deploy(0,0,"W");
    }


}
