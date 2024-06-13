package com.sunbeam;

import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 08:02
 */

public class Demo01Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> bookList;
		List<Candidate> candList;
		int choice, id, count;
		String subject;
		Book b;
		try(BookDao bookDao = new BookDao()) {
			try(CandidateDao candDao = new CandidateDao()) {
				do {
					System.out.print("\n1. Find All Books\n2. Find By Subject\n3. Find By Id\n4. Update Book\n5. Find All Candidates\nEnter choice: ");
					choice = sc.nextInt();
					switch (choice) {
					case 1: // Find All
						bookList = bookDao.findAll();
						bookList.forEach(e -> System.out.println(e));
						break;
					case 2: // Find By Subject
						System.out.print("Enter subject: ");
						subject = sc.next();
						bookList = bookDao.findBySubject(subject);
						bookList.forEach(e -> System.out.println(e));
						break;
					case 3: // Find By Id
						System.out.print("Enter Id: ");
						id = sc.nextInt();
						b = bookDao.findById(id);
						if(b != null)
							System.out.println("Found: " + b);
						else
							System.out.println("Book Not Found.");
						break;
					case 4: // Update Book
						b = acceptBook(sc);
						count = bookDao.update(b);
						System.out.println("Books Updated: " + count);
						break;
					case 5: // Find All Candidates
						candList = candDao.findAll();
						candList.forEach(e -> System.out.println(e));
						break;
					}
				} while(choice != 0);
			} // candDao.close();
		} // bookDao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Book acceptBook(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Author: ");
		String author = sc.next();
		System.out.print("Enter Subject: ");
		String subject = sc.next();
		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		return new Book(id, name, author, subject, price);
	}
}















