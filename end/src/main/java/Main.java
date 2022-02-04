import model.Movie;
import service.MovieService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MovieService service = new MovieService();
        ArrayList<Movie> movies = service.getAllMovie();

        service.show(movies);

    }
}
