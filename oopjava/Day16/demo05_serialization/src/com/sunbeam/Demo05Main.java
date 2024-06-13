package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 14:08
 */

public class Demo05Main {
	/*
	public static void writeMovies() {
		List<Movie> list = new ArrayList<Movie>();
		Collections.addAll(list, 
				new Movie(1, 8.5f, "Lord of Rings"),
				new Movie(2, 7.5f, "Harry Potter"),
				new Movie(3, 9.0f, "Forrest Gump"),
				new Movie(4, 6.0f, "Bruce Almighty"),
				new Movie(5, 8.0f, "Mission Impossible")
			);
		try(FileOutputStream fout = new FileOutputStream("movies.db")) {
			try(ObjectOutputStream oout = new ObjectOutputStream(fout)) {
			 	oout.writeObject(list);
			 	System.out.println("Movies Saved: " + list.size());
			} // oout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	public static void readMovies() {
		List<Movie> list = null;
		try(FileInputStream fin = new FileInputStream("movies.db")) {
			try(ObjectInputStream oin = new ObjectInputStream(fin)) {
				list = (List<Movie>) oin.readObject();
			} // oin.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		list.forEach(e -> System.out.println(e));
	}
	
	public static void main(String[] args) {
		//writeMovies();
		readMovies();
	}

}









