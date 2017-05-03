import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest
{
    @Test
    public void getDaysRented() throws Exception
    {
        Movie movie = new Movie("Test", 42);
        int newDaysRented = 42;
        Rental rental = new Rental(movie, newDaysRented);

        assertEquals(newDaysRented, rental.getDaysRented());
    }

    @Test
    public void getMovie() throws Exception
    {
        Movie movie = new Movie("Test", 42);
        int newDaysRented = 42;
        Rental rental = new Rental(movie, newDaysRented);

        assertEquals(movie, rental.getMovie());
    }

}