package com.app.tester;

import org.hibernate.*;

import com.app.dao.TeamDao;
import com.app.dao.TeamDaoImpl;
import com.app.entities.Team;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

public class AddNewTeam {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create dao
			TeamDao dao = new TeamDaoImpl();
			System.out.println(
					"Enter Team details : name,  abbreviation,  ownerName,  maxAge,  battingAvg,  wicketsTaken");
			Team newTeam = new Team(sc.next(), sc.next(),
					sc.next(), sc.nextInt(), 
					sc.nextDouble(), sc.nextInt());
			System.out.println(dao.addNewTeam(newTeam));
		} //JVM : sf.close() --> DBCP cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
