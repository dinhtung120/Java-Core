package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MovieService {

    public ArrayList<Movie> getAllMovie(){
        ArrayList<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("movie-data.json");
            Type type = new TypeToken<ArrayList<Movie>>(){}.getType();

            movies = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return movies;
    }

    public void show(ArrayList<?> list){
        for (Object o : list){
            System.out.println(o);
        }
    }
}
