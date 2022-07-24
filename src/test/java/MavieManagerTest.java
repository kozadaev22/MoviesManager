import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MavieManagerTest {


    @Test
    public void addMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("One");
        manager.addMovie("Two");
        manager.addMovie("Three");

        String[] expected = {"One", "Two", "Three"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastLimitMoreThanAdded() {
        MovieManager manager = new MovieManager(15);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");

        String[] expected = {"6", "5", "4", "3", "2"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAddedMoreThanLimit() {
        MovieManager manager = new MovieManager(3);
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");

        String[] expected = {"6", "5", "4"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastStandLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("1");
        manager.addMovie("2");
        manager.addMovie("3");
        manager.addMovie("4");
        manager.addMovie("5");
        manager.addMovie("6");

        String[] expected = {"6", "5", "4", "3", "2", "1"};
        String[] actual = manager.findeLast();
        assertArrayEquals(expected, actual);
    }
}

