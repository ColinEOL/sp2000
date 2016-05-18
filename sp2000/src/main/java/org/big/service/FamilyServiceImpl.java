package org.big.service;

import org.big.entity.Family;
import org.big.repository.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyServiceImpl implements FamilyService {

	@Autowired
	private FamilyRepository familyRepositoryImpl;
	
	@Override
	public Family findbyID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
