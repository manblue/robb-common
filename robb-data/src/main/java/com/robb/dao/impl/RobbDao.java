package com.robb.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.robb.dao.IRobbDao;

@Repository("robbDao")
public class RobbDao implements IRobbDao {

	private static Logger logger  = LoggerFactory.getLogger(RobbDao.class);
	public String add(String name) {
		logger.info("---{} {} {}", getClass(),"add",name);

		return name;
	}
}
