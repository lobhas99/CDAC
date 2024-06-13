package com.app.dao;

import com.app.pojos.Player;

public interface PlayerDao {
	String addPlayerToTeam(Integer teamId,Player newPlayer);

}
