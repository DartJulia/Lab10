package com.moviecategories;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("X-Men", "action"));
		movieList.add(new Movie("The Lion King", "animated"));
		movieList.add(new Movie("The Incredibles", "animated"));
		movieList.add(new Movie("The Matrix", "action"));
		movieList.add(new Movie("Lego Movie", "animated"));
		movieList.add(new Movie("Men in Black", "action"));
		movieList.add(new Movie("Jurassic Park", "scifi"));
		movieList.add(new Movie("The Martian", "scifi"));
		movieList.add(new Movie("Star Wars", "scifi"));
		movieList.add(new Movie("Moonlight", "drama"));
		movieList.add(new Movie("The Godfather", "drama"));
		movieList.add(new Movie("The Shawshank Redemption", "drama"));

		String cont = "y";

		System.out.println("Welcome to the Movie Application");
		System.out.println("There are 12 movies in this list.");
		
		while (cont.equals("y")) {
			System.out.println("Which category would you like? (animated, action, drama, scifi)");
			String userInput = scan.nextLine();
			if (!userInput.equals("scifi") || !userInput.equals("action") || !userInput.equals("animated")
					|| !userInput.equals("drama")) {
				System.out.println("Please enter a valid category");
			}

			for(Movie m:movieList) {
				if (m.getCategory().equalsIgnoreCase(userInput)) {
				System.out.println(m.getTitle());
				}
			}
			
			System.out.println("Would you like to continue? (y/n)");
			cont = scan.nextLine();
		
		}
		
	}

}
