package com.newew.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newew.blog.dao.NameDAO;
import com.newew.blog.dto.NameDTO;
import com.newew.blog.service.NameService;

@Service
public class NameServiceImpl implements NameService {

	@Autowired
	private NameDAO nameDAO;
	
	@Override
	public NameDTO getName() {
		NameDTO nameDTO = nameDAO.getName();
		return nameDTO;
	}
}
