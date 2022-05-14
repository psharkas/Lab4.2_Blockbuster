import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Movie> movies = new ArrayList<>();
		Movie vhs1 = new VHS();
		Movie vhs2 = new VHS();
		Movie vhs3 = new VHS();
		Movie dvd1 = new DVD();
		Movie dvd2 = new DVD();
		Movie dvd3 = new DVD();

		movies.add(vhs1);
		movies.add(vhs2);
		movies.add(vhs3);
		movies.add(dvd1);
		movies.add(dvd2);
		movies.add(dvd3);

		vhs1.setTitle("Avatar the Last Airbender");
		vhs1.setRunTime(103);
		vhs1.scenes.add("Aang awakes");
		vhs1.scenes.add("Aang fights Zuko");
		vhs1.scenes.add("Aang beats up the Fire Nation");
		
		vhs2.setTitle("National Treasure");
		vhs2.setRunTime(103);
		vhs2.scenes.add("Lost ship in the arctic is found");
		vhs2.scenes.add("Declaration of Independence is stolen");
		vhs2.scenes.add("Ben is arrested by the FBI");
		vhs2.scenes.add("Underground passage is found");
		vhs2.scenes.add("Treasure is found");
		
		vhs3.setTitle("Harry Potter & the Chamber of Secrets");
		vhs3.setRunTime(161);
		vhs3.scenes.add("Harry meets Dobby");
		vhs3.scenes.add("The Chamber of Secrets is opened");
		vhs3.scenes.add("Ginny has been taken into the Chamber");
		vhs3.scenes.add("Riddle summons the basilisk.");
		vhs3.scenes.add("Harry stabs the diary");
		vhs3.scenes.add("Dobby is freed");
		
		dvd1.setTitle("The Martian");
		dvd1.setRunTime(141);
		dvd1.scenes.add("Mark is stuck on Mars");
		dvd1.scenes.add("Mark creates a garden");
		dvd1.scenes.add("Mark is saved");
		dvd1.scenes.add("Mark returns to Earth");
		
		dvd2.setTitle("Dunkirk");
		dvd2.setRunTime(106);
		dvd2.scenes.add("The German ambush");
		dvd2.scenes.add("Tommy, Alex and Gibson are picked up by the British");
		dvd2.scenes.add("Tommy and Alex board the train");
		dvd2.scenes.add("Churchill's address to the nation");
		
		dvd3.setTitle("El Camino");
		dvd3.setRunTime(122);
		dvd3.scenes.add("Jesse talks to Mike");
		dvd3.scenes.add("Jesse flees");
		dvd3.scenes.add("Jesse talks to Ed Galbriath");
		dvd3.scenes.add("Jesse drives on in Alaska");

		System.out.println("Welcome to GC Blockbuster!");
		System.out.println("Please Select a Movie from the list: ");
		
		// iterates through the movie array list and prints out the movies
		for (int i = 0; i < movies.size(); i++) {
			System.out.print((i+1) + ") ");
			System.out.println(movies.get(i).getTitle());
		}
		
		// asks the user what movie they want to watch and stores the answer in a var
		System.out.println("Please select a movie you want to watch: ");
		int selection = scanner.nextInt();
		scanner.nextLine();
		movies.get(selection-1).printInfo();
		
		// asks the user to confirm that this is the movie they want to watch
		System.out.println("Do you want to watch the movie? Select yes or no");
		String answer = scanner.nextLine();
		
		
		// if yes, displays the scene and prompts for what scene to watch
		if (answer.equalsIgnoreCase("yes")){
			System.out.println("Which scene of the movie would you like to watch? ");
			for (int i = 0; i < movies.get(selection-1).scenes.size(); i++) {
				System.out.print("Scene " + (i+1) + ") ");
				System.out.println(movies.get(selection-1).scenes.get(i));
			}
			int selection2 = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Playing scene #" + selection2 + ", " + movies.get(selection-1).scenes.get(selection2-1));
		}
		
		
		
}
}
