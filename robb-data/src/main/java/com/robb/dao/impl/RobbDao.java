package com.robb.dao.impl;

import org.springframework.stereotype.Repository;

import com.robb.dao.IRobbDao;

@Repository("robbDao")
public class RobbDao implements IRobbDao {

	public String add(String name) {
		return name;
	}
}
