package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Exception.IDNotFoundException;
import com.capg.model.Client;
import com.capg.service.TDSService;

@RestController
@RequestMapping("/user/tds")
public class TDSController {
	@Autowired
	TDSService service;

	@GetMapping("/{id}")
	public Client getByPid(@PathVariable int id) throws IDNotFoundException  {
		Client client=service.getById(id);
		if(client==null) {
			throw new IDNotFoundException("id not found wrong ID: "+id);
		}
		else
			return client;
	}

}
