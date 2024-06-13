package com.sunbeam;

import java.util.List;
import java.util.Optional;

public class Main {
	/*
	public static void main(String[] args) {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			List<Candidate> list = candDao.findAll();
			list.forEach(e -> System.out.println(e));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/

	/*
	public static void main(String[] args) {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			List<Candidate> list = candDao.findAllOrderByVotesDesc();
			list.forEach(e -> System.out.println(e));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/
	/*
	public static void main(String[] args) {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			List<Candidate> list = candDao.findByParty("SP");
			list.forEach(e -> System.out.println(e));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/
	/*
	public static void main(String[] args) {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			Candidate c = new Candidate(0, "Nilesh", "Sunbeam", 240);
			int cnt = candDao.save(c);
			System.out.println("Rows Inserted: " + cnt);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/
	/*
	public static void main(String[] args) {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			Candidate c = new Candidate(10, "Nilesh", "SunBeam", 1);
			int cnt = candDao.update(c);
			System.out.println("Rows Updated: " + cnt);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/
	/*
	public static void main(String[] args) {
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			int cnt = candDao.deleteById(10);
			System.out.println("Rows Deleted: " + cnt);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	*/
	public static void main(String[] args) {
		// java.util.Optional demo
		try(CandidateDao candDao = new CandidateDaoImpl()) {
			int id = 1;
			Optional<Candidate> optCand = candDao.findById(id);

			// method 1 to deal with Optional
//			Candidate c = optCand.get(); // If candidate is present in Optional, it will be returned,
//			System.out.println("Found: " + c);	// otherwise NoSuchElementException will be thrown
		
			// method 2 to deal with Optional
//			if(optCand.isPresent()) {
//				Candidate c = optCand.get(); 
//				System.out.println("Found: " + c);
//			}
//			else
//				System.out.println("Candidate Not Found");

			// method 3 to deal with Optional
//			Candidate c = optCand.orElse(null); // If candidate is present in Optional, it will be returned,
//			System.out.println("Found: " + c);		// Otherwise given default value is returned (null).

			// method 4 to deal with Optional
			Candidate c = optCand.orElseThrow(() -> new RuntimeException("Candidate Not Found.")); // If candidate is present in Optional, it will be returned,
			System.out.println("Found: " + c);		// Otherwise exception given in Supplier will be thrown.
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}		
	}
}
