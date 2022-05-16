import java.util.ArrayList;

public class VHS extends Movie{
	//field
	private int currentTime;
	
	//get and set
	public int getCurrentTime() {
		return currentTime;
	}
	
	public void setCurrentTime(int currentTime) {
		this.currentTime= currentTime;
	}
	
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		super(title, runTime, scenes);
		currentTime = 0;
	}
	
	//Increments which scene is playing and then rewinds back to the beginning
	@Override
	public void play() {
		System.out.println("Current time: " + currentTime);
		currentTime++;
		if(currentTime > getRunTime() - 1) {
			rewind();
		}
		
	}
	
	//sets it back to scene 1
	public void rewind() {
		currentTime = 0;
	}

}
