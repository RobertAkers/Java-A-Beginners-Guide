import java.util.Scanner;
public class Sound {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("How long did it take the strike to reach you?");
		double farAway = Double.parseDouble(reader.nextLine());
		
		double time;
		
		farAway = farAway * 1100;
		System.out.println("The strike was " + farAway + " feet from you.");

		}
	}


