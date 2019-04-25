package original;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {


    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;
    public static final int CHILDRENS = 2;
    private Customer customer;

    @Before
    public void setUp() throws Exception {

        customer = new Customer(null);
    }

    @Test
    public void testX() {
        String statement = customer.statement();

        assertEquals("Rental Record for null\n"
            + "Amount owed is 0.0\n"
            + "You earned 0 frequent renter pointers", statement);
    }

    @Test
    public void statement_for_regularMovie_daysRented_is_less_than_three_days() {
        Rental rental = getRental(2, REGULAR);
        customer.addRental(rental);
        String statement = customer.statement();

        assertEquals("Rental Record for null\n"
            + "\t2.0(null)\n"
            + "Amount owed is 2.0\n"
            + "You earned 1 frequent renter pointers", statement);
    }

    @Test
    public void statement_for_regularMovie_daysRented_is_more_than_two_days() {
        Rental rental = getRental(3, REGULAR);
        customer.addRental(rental);
        String statement = customer.statement();

        assertEquals("Rental Record for null\n"
            + "\t3.5(null)\n"
            + "Amount owed is 3.5\n"
            + "You earned 1 frequent renter pointers", statement);
    }

    @Test
    public void statement_for_new_release() {
        Rental rental = getRental(3, NEW_RELEASE);
        customer.addRental(rental);
        String statement = customer.statement();

        assertEquals("Rental Record for null\n"
            + "\t9.0(null)\n"
            + "Amount owed is 9.0\n"
            + "You earned 2 frequent renter pointers", statement);
    }

    @Test
    public void statement_for_childrens_Movie_daysRented_is_less_than_four_days() {
        Rental rental = getRental(3, CHILDRENS);
        customer.addRental(rental);
        String statement = customer.statement();

        assertEquals("Rental Record for null\n"
            + "\t1.5(null)\n"
            + "Amount owed is 1.5\n"
            + "You earned 1 frequent renter pointers", statement);
    }

    @Test
    public void statement_for_childrens_Movie_daysRented_is_more_than_three_days() {
        Rental rental = getRental(4, CHILDRENS);
        customer.addRental(rental);
        String statement = customer.statement();

        assertEquals("Rental Record for null\n"
            + "\t3.0(null)\n"
            + "Amount owed is 3.0\n"
            + "You earned 1 frequent renter pointers", statement);
    }

    private Rental getRental(int daysRented, int priceCode) {
        String title = null;
        Movie movie = new Movie(title, priceCode);
        return new Rental(movie, daysRented);
    }

}
