import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class MovieService {


    public ArrayList<Movie> getAllMovie() {
        ArrayList<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie.json");
            Type type = new TypeToken<ArrayList<Movie>>() {
            }.getType();

            movies = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return movies;
    }

    public void show(ArrayList<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public void sortByYear(ArrayList<Movie> movies) {
        System.out.println("    Danh sách phim sắp xếp theo năm phát hành:");
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear();
            }
        });
        show(movies);

    }


    public void sortByTitle(ArrayList<Movie> movies) {
        System.out.println("    Danh sách phim sắp xếp theo tên:");
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        show(movies);
    }

    public void searchByTitle(ArrayList<Movie> movies, String searchTitle) {
        System.out.println("Phim bạn đang tìm là: ");
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println(movie);
            }

        }
    }

    public void top3View(ArrayList<Movie> movies) {
        System.out.println("Top 3 phim có lượt xem cao nhất là:");
        Collections.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {

                return o2.getView() - o1.getView();
            }
        });
        System.out.println(movies.get(0));
        System.out.println(movies.get(1));
        System.out.println(movies.get(2));
    }

    public void searchByCategory(ArrayList<Movie> movies, String searchCategory) {
        System.out.println("Các phim thể loại bạn tìm là:");
        for (Movie movie : movies) {
            if (Arrays.toString(movie.getCategory()).toLowerCase().contains(searchCategory.toLowerCase())) {
                System.out.println(movie);
            }
        }
    }


}
