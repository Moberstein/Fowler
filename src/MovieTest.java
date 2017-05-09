import static org.junit.Assert.*;

public class MovieTest
{
    @org.junit.Test
    public void getPriceCode() throws Exception
    {
        int priceCode = Movie.CHILDRENS;
        Movie movie = new Movie("Test", priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }

    @org.junit.Test
    public void getPriceCodeNegative() throws Exception
    {
        int priceCode = Movie.CHILDRENS;
        Movie movie = new Movie("Test", priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }

    @org.junit.Test
    public void getPriceCodeMax() throws Exception
    {
        int priceCode = Movie.CHILDRENS;
        Movie movie = new Movie("Test", priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }

    @org.junit.Test
    public void setPriceCode() throws Exception
    {
        int priceCode = Movie.CHILDRENS;
        Movie movie = new Movie("Test", 0);
        movie.setPriceCode(priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }

    @org.junit.Test
    public void setPriceCodeNegative() throws Exception
    {
        int priceCode = Movie.CHILDRENS;
        Movie movie = new Movie("Test", 0);
        movie.setPriceCode(priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }

    @org.junit.Test
    public void setPriceCodeMax() throws Exception
    {
        int priceCode = Movie.CHILDRENS;
        Movie movie = new Movie("Test", 0);
        movie.setPriceCode(priceCode);
        assertEquals(priceCode, movie.getPriceCode());
    }

    @org.junit.Test
    public void getTitle() throws Exception
    {
        String title = "Title";
        Movie movie = new Movie(title, 0);
        assertEquals(title, movie.getTitle());
    }

    @org.junit.Test
    public void getTitleNull() throws Exception
    {
        String title = null;
        Movie movie = new Movie(title, 0);
        assertEquals(title, movie.getTitle());
    }

}