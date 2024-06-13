package com.sunbeam;

import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-06 08:52
 */

public class Demo01Main {
	public static Candidate acceptCandidate(Scanner sc) {
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Party: ");
		String party = sc.next();
		System.out.print("Enter Votes: ");
		int votes = sc.nextInt();
		Candidate c = new Candidate(id, name, party, votes);	
		return c;
	}
	public static void main(String[] args) {
		//TODO: Menu driven program
		
		Scanner sc = new Scanner(System.in);
		/*
		try(CandidateDao dao = new CandidateDao()) {
			Candidate c = acceptCandidate(sc);
			int count = dao.update(c);
			System.out.println("Rows Updated: " + count);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter party: ");
			String party = sc.next();
			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}











