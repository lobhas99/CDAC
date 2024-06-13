package com.app.dao;

import org.hibernate.*;

import com.app.entity.Team;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;

public class TeamDaoImpl implements TeamDao {

	@Override
	public String addNewTeam(Team newTeam) {
		String mesg = "Adding new team failed";
		// 1.open session
		Session session = getFactory().openSession();
		// 2.begin a tx
		Transaction tx = session.beginTransaction();
		try {
			Serializable teamId = session.save(newTeam);
			// success
			tx.commit();
			mesg = "Add new team with ID" + teamId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the same exception to caller
			throw e;
		} finally {
			// close session=>L! cache gets destroyed and pooled out
			if (session != null)
				session.close();
		}
		return mesg;
	}

}
