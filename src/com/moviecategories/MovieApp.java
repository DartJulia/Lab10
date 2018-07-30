package com.moviecategories;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Creating ArrayList to store first set of movies
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

		// adds 100 movies from MovieIO class
		for (int i = 0; i <= 100; i++) {

			movieList.add(MovieIO.getMovie(i));
		}

		// variable to continue
		String cont = "y";

		System.out.println("Welcome to the Movie Application");
		System.out.println("There are 12 movies in this list.");
		
		// While loop to continue displaying the list of movies if user desires
		while (cont.equals("y")) {
			System.out.println("Which category would you like? (animated, musical, drama, scifi, horror)");
			String userInput = scan.nextLine();
			// Test to validate input
			if (!userInput.equals("scifi") || !userInput.equals("horror") || !userInput.equals("animated")
					|| !userInput.equals("drama") || !userInput.equals("musical")) {
				System.out.println("Please enter a valid category");
			}
			// For loop will extract movie titles based on the category selected
			// by user(i.e. drama or action..)
			for(Movie m:movieList) {
				if (m.getCategory().equalsIgnoreCase(userInput)) {
				System.out.println(m.getTitle());
				}
			}
			// Prompts user to continue
			System.out.println("Would you like to continue? (y/n)");
			cont = scan.nextLine();
		
		}
		scan.close();
	}

}
