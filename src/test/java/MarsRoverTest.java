import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import com.google.common.collect.Lists;
import java.util.List;
import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class MarsRoverTest {

    @Test
    public void should_override_area_equals() {
        assertThat(Area.of(10, 10), is(Area.of(10, 10)));
    }

    @Test
    public void should_set_work_range() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        assertThat(marsRover.workArea(), is(Area.of(10, 10)));
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
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(6, 5, Direction.EAST)));
    }

    @Test
    public void should_backward_east() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(4, 5, Direction.EAST)));
    }

    @Test
    public void should_forward_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(4, 5, Direction.WEST)));
    }

    @Test
    public void should_backward_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(6, 5, Direction.WEST)));
    }

    @Test
    public void should_forward_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(5, 6, Direction.NORTH)));
    }

    @Test
    public void should_backward_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(5, 4, Direction.NORTH)));
    }

    @Test
    public void should_forward_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(5, 4, Direction.SOUTH)));
    }

    @Test
    public void should_backward_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.backward();
        assertThat(position, is(Position.of(5, 6, Direction.SOUTH)));
    }

    @Test
    public void should_rotate_left_to_west_given_face_to_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.WEST)));
    }

    @Test
    public void should_rotate_left_to__given_face_to_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.SOUTH)));
    }

    @Test
    public void should_rotate_left_to_west_given_face_to_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.WEST)));
    }

    @Test
    public void should_rotate_left_to_north_given_face_to_east() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.rotateLeft();
        assertThat(position, is(Position.of(5, 5, Direction.NORTH)));
    }

    @Test
    public void should_rotate_right_to_east_given_face_to_south() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.SOUTH));
        Position position = marsRover.rotateRight();
        assertThat(position, is(Position.of(5, 5, Direction.EAST)));
    }

    @Test
    public void should_rotate_right_to_north_given_face_to_east() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.EAST));
        Position position = marsRover.rotateRight();
        assertThat(position, is(Position.of(5, 5, Direction.SOUTH)));
    }

    @Test
    public void should_rotate_right_to_west_given_face_to_north() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.NORTH));
        Position position = marsRover.rotateRight();
        assertThat(position, is(Position.of(5, 5, Direction.EAST)));
    }

    @Test
    public void should_rotate_right_to_north_given_face_to_west() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));
        Position position = marsRover.rotateRight();
        assertThat(position, is(Position.of(5, 5, Direction.NORTH)));
    }

    @Test
    public void should_execute_batch_command() {
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(10, 10));
        marsRover.deploy(Position.of(5, 5, Direction.WEST));

        List<Command> commands = Lists.newArrayList();
        commands.add(Command.forwardCommand(marsRover));
        commands.add(Command.forwardCommand(marsRover));
        commands.add(Command.forwardCommand(marsRover));
        commands.add(Command.backwardCommand(marsRover));
        commands.add(Command.rotateRightCommand(marsRover));
        commands.add(Command.rotateRightCommand(marsRover));
        commands.add(Command.rotateLeftCommand(marsRover));

        Position position = marsRover.executeBatchCommand(commands);
        assertThat(position, is(Position.of(3, 5, Direction.NORTH)));
    }

    @Test
    public void should_not_forward_out_of_work_area(){
        MarsRover marsRover = new MarsRover();
        marsRover.workArea(Area.of(1, 1));
        marsRover.deploy(Position.of(0, 0, Direction.EAST));
        marsRover.forward();
        marsRover.forward();
        Position position = marsRover.forward();
        assertThat(position, is(Position.of(1, 0, Direction.EAST)));
    }
}
