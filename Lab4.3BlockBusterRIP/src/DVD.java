import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie{

		private static Scanner scan;
		
	public DVD(String title, int runTime, ArrayList<String> scenes) {
			super(title, runTime, scenes);
			Scanner scan = new Scanner(System.in);
	}

	
	@Override
	public void play() {

		System.out.println("Which scene would you like to watch?");
		printScenes();
		int sceneChoice = scan.nextInt();
		scan.nextLine();
		System.out.println("Now playing: " + sceneChoice + getScenes().get(sceneChoice));
		
	}

}
