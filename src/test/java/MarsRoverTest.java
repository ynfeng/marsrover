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
        assertThat(marsRover.position(), is(Position.of(0, 0, Direction.WEST)));
    }

    @Test
    public void should_forward_east() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(6, 5, Direction.EAST)));
    }

    @Test
    public void should_backward_east() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(4, 5, Direction.EAST)));
    }

    @Test
    public void should_forward_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(4, 5, Direction.WEST)));
    }

    @Test
    public void should_backward_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(6, 5, Direction.WEST)));
    }

    @Test
    public void should_forward_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(5, 6, Direction.NORTH)));
    }

    @Test
    public void should_backward_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(5, 4, Direction.NORTH)));
    }

    @Test
    public void should_forward_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(5, 4, Direction.SOUTH)));
    }

    @Test
    public void should_backward_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(5, 6, Direction.SOUTH)));
    }

    @Test
    public void should_rotate_left_to_west_given_face_to_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.WEST)));
    }

    @Test
    public void should_rotate_left_to_north_given_face_to_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.NORTH)));
    }

    @Test
    public void should_rotate_left_to_east_given_face_to_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.EAST)));
    }

    @Test
    public void should_rotate_left_to_south_given_face_to_east() {
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.SOUTH)));
    }

    @Test
    public void should_rotate_right_to_east_given_face_to_south(){
        MarsRover marsRover = new MarsRover();
        marsRover.workRage(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.rotateRight();
        assertThat(position, is(Position.of(5, 5, Direction.NORTH)));
    }
}
