package test;

import main.Movie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MovieTest {
    public static Movie m1;
    public static Movie m2;

    @BeforeAll
    public static void setUp() {
        m1 = new Movie("Movie1", 0);
        m2 = new Movie("Movie2", 1);
    }

    @Test
    void getPriceCode() {
        Assertions.assertEquals(0, m1.getPriceCode());
        Assertions.assertEquals(1, m2.getPriceCode());
    }

    @Test
    void getTitle() {
        Assertions.assertEquals("Movie1", m1.getTitle());
        Assertions.assertEquals("Movie2", m2.getTitle());
    }
}