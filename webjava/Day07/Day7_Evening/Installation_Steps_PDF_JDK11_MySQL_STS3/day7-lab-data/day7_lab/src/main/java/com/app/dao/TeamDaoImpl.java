package com.app.dao;

import com.app.entities.Team;
import org.hibernate.*;
import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;

public class TeamDaoImpl implements TeamDao {

	@Override
	public String addNewTeam(Team newTeam) {
		String mesg="Adding new team failed!!!!!";
		// 1. open session from SF
		Session session=getFactory().openSession();
		//2. begin a tx
		Transaction tx=session.beginTransaction();
		try {
			Serializable teamId= session.save(newTeam);
			//=> success
			tx.commit();//DML : insert
			mesg="Added new team with ID="+teamId;
		} catch (RuntimeException e) {
			//=> error
			if(tx != null)
				tx.rollback();
			//re throw the SAME exc to the caller
			throw e;
		} finally {
			//close session => L1 cache gets destroyed n pooled out db cn rets to the DBCP
			if(session != null)
				session.close();
		}
		return mesg;
	}

}
