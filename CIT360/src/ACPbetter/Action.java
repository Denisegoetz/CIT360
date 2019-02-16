package ACPbetter;


public class Action implements Handler {
	@Override
	public void execute(int movie) {
		System.out.println("The Dark Knight");
		System.out.println("Spider-Man: Homecoming");
		System.out.println("Raiders of the Lost Ark");
		System.out.println("Star Wars");
	}
}