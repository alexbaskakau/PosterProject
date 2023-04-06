import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PosterMovie;

public class PosterMovieTest {

    @Test
    public void shouldAddMovie() {
        PosterMovie film = new PosterMovie();
        film.addMovie("m1");
        film.addMovie("m2");
        film.addMovie("m3");
        film.addMovie("m4");
        String[] expected = {"m1", "m2", "m3", "m4"};
        String[] actual = film.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLimit() {
        PosterMovie film = new PosterMovie(3);
        film.addMovie("m1");
        film.addMovie("m2");
        film.addMovie("m3");
        film.addMovie("m4");
        String[] exoected = {"m4", "m3", "m2"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(exoected, actual);
    }

    @Test
    public void shouldFindLastFive() {
        PosterMovie film = new PosterMovie();
        film.addMovie("m1");
        film.addMovie("m2");
        film.addMovie("m3");
        film.addMovie("m4");
        film.addMovie("m5");
        film.addMovie("m6");
        film.addMovie("m7");
        String[] expected = {"m7", "m6", "m5", "m4", "m3"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindWhenLessThenLimit() {
        PosterMovie film = new PosterMovie(7);
        film.addMovie("m1");
        film.addMovie("m2");
        film.addMovie("m3");
        String[] expected = {"m3", "m2", "m1"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindIfMoviesEqualLimit() {
        PosterMovie film = new PosterMovie(3);
        film.addMovie("m1");
        film.addMovie("m2");
        film.addMovie("m3");
        String[] expected = {"m3", "m2", "m1"};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindIfNoMovies() {
        PosterMovie film = new PosterMovie();
        String[] expected = {};
        String[] actual = film.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
