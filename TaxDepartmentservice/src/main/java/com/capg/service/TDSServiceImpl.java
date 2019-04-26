package com.capg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capg.DAO.TDSDao;
import com.capg.model.Client;
@Component("service")
@Service
@Transactional
public class TDSServiceImpl implements TDSService {
	@Autowired
	TDSDao tdsdao;
	@Override
	public Client getById(int id) {
		// TODO Auto-generated method stub
		return tdsdao.getById(id);
	}

}
