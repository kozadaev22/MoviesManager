import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MavieManagerTest {


    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        String[] expected = {"1", "2", "3", "4", "5"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLastWithoutLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shuldFindLastWithLimitLessRange(){
        MovieManager manager = new MovieManager(4);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        String[] expected = {"5", "4", "3", "2"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shuldFindLastWithLimitEqualAdded(){
        MovieManager manager = new MovieManager(5);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shuldFindLastWithLimitMoreRange(){
        MovieManager manager = new MovieManager(8);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        String[] expected = {"5", "4", "3", "2", "1"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }
}

