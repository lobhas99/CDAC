/**
 * 
 */
package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void userOperations() {
		int choice;
		User curUser = null;
		do {
			System.out.print("\n1. Sign Up\n2. Sign In\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0: // Exit
				System.out.println("Bye!");
				break;
			case 1: // Sign Up	
				signUp();
				break;
			case 2: // Sign In	
				curUser = signIn();
				if(curUser != null) {
					if(curUser.getRole() == Role.admin)
						adminOperations(curUser);
					else
						voterOperations(curUser);
				}
				break;
			}
		}while(choice != 0);
	}

	public static void signUp() {
		System.out.print("First Name: ");
		String fname = sc.next();
		System.out.print("Last Name: ");
		String lname = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Password: ");
		String passwd = sc.next();
		System.out.print("Birth Date (dd-MM-yyyy): ");
		String dateStr = sc.next();
		User voter = new User(0, fname, lname, email, passwd, DateUtil.parse(dateStr), false, Role.voter);
		try(UserDao dao = new UserDao()) {
			int count = dao.save(voter);
			System.out.println("Voter registered: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static User signIn() {
		String email;
		String password;
		System.out.print("Enter email: ");
		email = sc.next();
		System.out.print("Enter password: ");
		password = sc.next();
		try(UserDao dao = new UserDao()) {
			User user = dao.findByEmail(email);
			if(user != null && password.equals(user.getPassword()))
				return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void adminOperations(User curUser) {
		int choice;
		do {
			System.out.print("\n0. Log out\n1. Add Candidate\n2. Delete Candidate\n3. Display All Candidates\n4. Display Partywise Votes\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0: // Log out
				System.out.println("Bye!");
				break;
			case 1: //TODO Add Candidates
				System.out.println("Not yet implemented!");
				break;
			case 2: // Delete Candidate	
				deleteCandidate();
				break;
			case 3: // Display all Candidates
				displayAllCandidates();
				break;
			case 4: // Display Partywise Votes
				displayPartywiseVotes();
				break;
			}
		}while(choice != 0);		
	}

	public static void displayPartywiseVotes() {
		try(CandidateDao dao = new CandidateDao()) {
			List<PartyVotes> list = dao.getPartywiseVotes();
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static void displayAllCandidates() {
		try(CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteCandidate() {
		System.out.print("Enter candidate id: ");
		int candId = sc.nextInt();
		try(CandidateDao dao = new CandidateDao()) {
			int count = dao.deleteById(candId);
			System.out.println("Candidates Deleted: " + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void voterOperations(User curUser) {
		int choice;
		do {
			System.out.print("\n0. Log out\n1. Edit Profile\n2. Change Password\n3. Vote for Candidate\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0: // Log out
				System.out.println("Bye!");
				break;
			case 1: // TODO Edit Profile
				System.out.println("Not yet implemented!");
				break;
			case 2: // TODO Change Password
				System.out.println("Not yet implemented!");
				break;
			case 3: // Vote for Candidate
				voteForCandidate(curUser);
				break;
			}
		}while(choice != 0);		
	}
	
	private static void voteForCandidate(User curUser) {
		int count = 0;
		try(CandidateDao dao = new CandidateDao()) {
			// display all candidates
			List<Candidate> list = dao.findAll();
			list.forEach(System.out::println);
			// increment vote of the candidate
			System.out.print("Enter candidate id: ");
			int candId = sc.nextInt();
			count = dao.incrementVote(candId);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		if(count == 1) {
			// update voter status to true (voted)
			try(UserDao dao = new UserDao()) {
				count = dao.markVoted(curUser.getId());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		if(count == 1)
			System.out.println("Voted successfully!");
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		userOperations();
		sc.close();
	}
}
