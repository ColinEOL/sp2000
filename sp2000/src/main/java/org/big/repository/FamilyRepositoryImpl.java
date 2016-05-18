package org.big.repository;

import java.util.List;

import org.big.entity.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FamilyRepositoryImpl implements FamilyRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public Family FindbyID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
