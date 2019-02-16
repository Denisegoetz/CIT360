package ACPbetter;


import java.util.HashMap;

public class MovieController {
    public static HashMap<Integer, Handler> movies = new HashMap<Integer, Handler>();

    public static void put(int movie){
    	movies.put(1, new Action());
    	movies.put(2, new Thriller());
    	movies.put(3, new StupidMovies());

        Handler handler = movies.get(movie);
        handler.execute(movie);
    }
}