import java.util.ArrayList;

public abstract class Movie {
	
	//fields
	private String title;
	private int runTime;
	ArrayList<String> scenes = new ArrayList<>();

	//gets and sets
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}
	
	public Movie(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}
	
	public void printInfo() {
		System.out.println("Title: " + title + "Runtime: " + runTime + " minutes");
	}
	
	public void printScenes() {
		for(int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + scenes.get(i) + ": " + i);
		}
	}
	
	public abstract void play();

}
