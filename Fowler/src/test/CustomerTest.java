package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Movie;
import main.Rental;
import main.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    private Movie m1 = new Movie("main.Movie1", 1);
    private Movie m2 = new Movie("main.Movie2", 2);
    private Movie m3 = new Movie("main.Movie3", 0);

    private Rental r1 = new Rental(m1, 10);
    private Rental r2 = new Rental(m2, 5);
    private Rental r3 = new Rental(m2, 2);
    private Rental r4 = new Rental(m3, 3);

    private Customer c1 = new Customer("Customer1");
    private Customer c2 = new Customer("Customer2");
    private Customer c3 = new Customer("Customer3");

    @Test
    @DisplayName("Statements should return correct String")
    public void testStatements() {

        c1.addRental(r1);
        c2.addRental(r2);
        c3.addRental(r3);
        c3.addRental(r4);

        // Actual results
        String result1 = c1.statement();
        String result2 = c2.statement();
        String result3 = c3.statement();

        // Expected results
        String result1Expected = "main.Rental Record for Customer1\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmain.Movie1\t\t10\t30.0\n" +
                "Amount owed is 30.0\n" +
                "You earned 2 frequent renter points";
        String result2Expected = "main.Rental Record for Customer2\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmain.Movie2\t\t5\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        String result3Expected = "main.Rental Record for Customer3\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tmain.Movie2\t\t2\t1.5\n" +
                "\tmain.Movie3\t\t3\t1.5\n" +
                "Amount owed is 3.0\n" +
                "You earned 2 frequent renter points";

        // Actual <-> Expected
        assertEquals(result1, result1Expected);
        assertEquals(result2, result2Expected);
        assertEquals(result3, result3Expected);
    }

}