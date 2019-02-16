package ACPbetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppController {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		MovieController controller = new MovieController();

		try {
			System.out.println("Movies!");
			System.out.println("What kind of movie would you like?");
			System.out.println("1 for Action");
			System.out.println("2 for Thriller");
			System.out.println("3 for Stupid Movies");

			int movie = Integer.parseInt(read.readLine());
			controller.put(movie);
		} catch (Exception e) {
			System.out.println("Please select one of the listed Options!");
			int movie = Integer.parseInt(read.readLine());
			controller.put(movie);
		}
	}
}