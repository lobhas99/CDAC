package com.sunbeam;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 15:04
 */

public class Demo06Main {
	public static void writeMovies() {
		List<Movie> list = new ArrayList<Movie>();
		Collections.addAll(list, 
				new Movie(1, 8.5f, "Lord of Rings"),
				new Movie(2, 7.5f, "Harry Potter"),
				new Movie(3, 9.0f, "Forrest Gump"),
				new Movie(4, 6.0f, "Bruce Almighty"),
				new Movie(5, 8.0f, "Mission Impossible")
			);
		try(FileOutputStream fout = new FileOutputStream("movies.txt")) {
			try(PrintStream pout = new PrintStream(fout)) {				
				pout.printf("|%5s|%6s|%-30s|\n", "Id", "Rating", "Title");
				for(Movie m : list) {
					pout.printf("|%5d|%6.1f|%-30s|\n", m.getId(), m.getRating(), m.getTitle());
				}
				System.out.println("Movied saved.");
			} // pout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		writeMovies();
	}
}
