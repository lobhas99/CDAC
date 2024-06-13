package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 12:21
 */

public class Demo04Main {
	public static void writeMovies() {
		List<Movie> list = new ArrayList<Movie>();
		Collections.addAll(list, 
				new Movie(1, 8.5, "Lord of Rings"),
				new Movie(2, 7.5, "Harry Potter"),
				new Movie(3, 9.0, "Forrest Gump"),
				new Movie(4, 6.0, "Bruce Almighty"),
				new Movie(5, 8.0, "Mission Impossible")
			);
		try(FileOutputStream fout = new FileOutputStream("movies.bin")) {
			try(DataOutputStream dout = new DataOutputStream(fout)) {
				for (Movie m : list) {
					dout.writeInt(m.getId());
					dout.writeDouble(m.getRating());
					dout.writeUTF(m.getTitle());
				}
				System.out.println("Movies saved: " + list.size());
			} // dout.close();
		} // fout.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void readMovies() {
		List<Movie> list = new ArrayList<Movie>();
		try(FileInputStream fin = new FileInputStream("movies.bin")) {
			try(DataInputStream din = new DataInputStream(fin)) {
				while(true) {
					Movie m = new Movie();
					m.setId( din.readInt() );
					m.setRating( din.readDouble() );
					m.setTitle( din.readUTF() );
					//System.out.println(m);
					list.add(m);
				}
			} // din.close();
		} // fin.close();
		catch (EOFException e) {
			// do nothing -- close() is done auto -- AutoCloseable
		}
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









