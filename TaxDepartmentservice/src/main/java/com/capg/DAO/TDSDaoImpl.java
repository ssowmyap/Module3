package com.capg.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capg.model.Client;
@Component("dao")
@Repository
@ComponentScan("com.capg")
public class TDSDaoImpl implements TDSDao {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public Client getById(int id) {
		Client client=entityManager.find(Client.class, id);
		return client;
	}

}
