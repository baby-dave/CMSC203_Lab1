import java.util.Scanner;

public class MovieDriver_Task1 {

	public static void main(String[] args) {
		
		
		/**
		 *writing a Driver Class
		 *This part of the code covers task #1
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		Movie m1 = new Movie();
	
		System.out.println("Enter the name of movie ");
		String movieName=input.nextLine();
		
		m1.setTitle(movieName);
		 
		System.out.println("Enter the rating of the movie");
		String movieRating= input.nextLine();
		
		m1.setRating(movieRating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int movieTicket= input.nextInt();
		
		m1.setSoldTickets(movieTicket);
		
		System.out.println(m1.toString());
		System.out.println("Goodbye");
		
		
	}
	

}
