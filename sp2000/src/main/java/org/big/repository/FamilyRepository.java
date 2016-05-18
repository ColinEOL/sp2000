package org.big.repository;

import java.util.List;

import org.big.entity.Family;

public interface FamilyRepository{
	public Family FindbyID(String ID);
	//public List<Family> FindbyName(String familyName);
}
