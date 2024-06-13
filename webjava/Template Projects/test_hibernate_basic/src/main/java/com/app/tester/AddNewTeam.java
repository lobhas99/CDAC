package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.TeamDao;
import com.app.dao.TeamDaoImpl;
import com.app.entity.Team;

public class AddNewTeam {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) {
			Scanner sc = new Scanner(System.in);
			TeamDao dao = new TeamDaoImpl();
			System.out.println("Enter new details:name, abbreviation, owner, maxAge, battingAvg, wicketsTaken");
			Team newTeam = new Team(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt());
			System.out.println(dao.addNewTeam(newTeam));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
