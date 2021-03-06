import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BlockBusterApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList<>();
		
		ArrayList<String> shrekScenes = new ArrayList<String>(Arrays.asList("Fairytail people are in Shrek's swamp.",
				"Shrek meets Donkey", "Lord Farquad tells Shrek to save princess.", 
				"Shrek saves princess", "Princess turns into ogre"));
		movies.add(new DVD("Shrek", 180, shrekScenes));
		
		ArrayList<String> notebookScenes = new ArrayList<String>(Arrays.asList("Ryan meets Rachel",
				"They go to a carnival I think?", "You see old people", "It's them"));
		movies.add(new DVD("The Notebook", 130, notebookScenes));
		
		ArrayList<String> shiningScenes = new ArrayList<String>(Arrays.asList("Driving through mountain pass", "Jack staring blankly out window",
				"Jack being frozen in wintery maze"));
		movies.add(new VHS("The Shining", 160, shiningScenes));
		
		ArrayList<String> holesScenes = new ArrayList<String>(Arrays.asList("Shia is bad boy", "Shia has to live in my personal hell",
				"Shia digs holes"));
		movies.add(new VHS("Holes", 90, holesScenes));
		
		ArrayList<String> clickScenes = new ArrayList<String>(Arrays.asList("Life sucks", "Adam finds universal remote at B cubed",
				"Life is a glitch", "Sadness"));
		movies.add(new DVD("Click", 5, clickScenes));
		
		ArrayList<String> groundHogDayScenes = new ArrayList<String>(Arrays.asList("It's groundhog day",
				"It's still groundhog day :(", "I'm pretty sure it's never going to not be groundhog day"));
		movies.add(new VHS("Groundhog Day", 9001, groundHogDayScenes));
		
		
		System.out.println("Welcome to Triscuit's BlockBuster");
		
		System.out.println("Please choose one of the following movies: ");
		for(int i = 0; i < movies.size(); i++) {
			System.out.println((i + 1) + ": " + movies.get(i).getTitle());
		}
		
		int movieChoice = scan.nextInt();
		scan.nextLine();
		System.out.println(movies.get(movieChoice - 1).getTitle());
		System.out.println(movies.get(movieChoice - 1).getRunTime() + " minutes");
		
		System.out.println("\nDo you want to watch this movie? y/n");
		String watchChoice = scan.nextLine();
		if(watchChoice.equalsIgnoreCase("y")) {
			movies.get(movieChoice - 1).play();
		}
		
	}

}
