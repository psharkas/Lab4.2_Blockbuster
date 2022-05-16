import java.util.ArrayList;

public abstract class Movie {

	private String title;
	private int runTime;
	ArrayList<String> scenes = new ArrayList<>();

	public void printInfo() {
		System.out.println(title);
		System.out.println(runTime + " minutes");

	}

	public void printScenes() {

		for (int i = 0; i < scenes.size(); i++) {
			System.out.print(scenes.get(i));
			System.out.println(" is scene number " + i);
		}

	}

	public abstract void play();

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

}
