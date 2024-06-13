package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pojos.Player;
import com.app.pojos.Team;

public class PlayerDaoImpl implements PlayerDao {

	@Override
	public String addPlayerToTeam(Integer teamId, Player newPlayer) {
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			 Team team=session.get(Team.class,teamId);
			 if(team!=null)
			team.addPlayer(newPlayer);
			 tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
			return null;
	}

}
