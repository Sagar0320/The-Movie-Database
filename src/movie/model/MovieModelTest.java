package movie.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieModelTest
{

  	public MovieModel mm = new MovieModel();

	//String cast, String rating, String genre, String runtime, String category, String releaseDate, String summary)
	@Test
	public void addMovieTest()
	{
		MovieModel mm = new MovieModel();
		MovieModel test = new MovieModel();
		
		mm.deleteMovie("Harry Potter");
		test.deleteMovie("Harry Potter");
		
		assertEquals(mm, test);
		
		
	}

}
