import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest
{
    @Test
    public void addRental() throws Exception
    {
        Movie movie = new Movie("Test", Movie.CHILDRENS);
        Rental rental = new Rental(movie, 5);
        Customer customer = new Customer("NewName");
        customer.addRental(rental);

    }

    @Test
    public void getName() throws Exception
    {
        Movie movie = new Movie("Test", Movie.CHILDRENS);
        String newName = "NewName";
        Customer customer = new Customer(newName);

        assertEquals(newName, customer.getName());
    }

    @Test
    public void statement() throws Exception
    {
        Movie movie1 = new Movie("Test1", Movie.CHILDRENS);
        Movie movie2 = new Movie("Test2", Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 6);
        Customer customer = new Customer("NewName");

        customer.addRental(rental1);
        customer.addRental(rental2);

        String statement = "Rental Record for NewName\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTest1\t\t5\t4.5\n" +
                "\tTest2\t\t6\t6.0\n" +
                "Amount owed is 10.5\n" +
                "You earned 2 frequent renter points";
        assertEquals(statement, customer.statement());
    }

    @Test
    public void statementEmpty() throws Exception
    {
        Customer customer = new Customer("NewName");

        String statement = "Rental Record for NewName\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";
        assertEquals(statement, customer.statement());
    }

}