package com.si.dsi.questao4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dsi.questao4.entity.SupportedPeople;
import com.si.dsi.questao4.respository.SupportedPeopleRepository;

@Service
public class SupportedPeopleService {
	
	@Autowired
	private SupportedPeopleRepository repository;
	
	public List<SupportedPeople> getAll() {
		return repository.findAll();
	}
	
	public SupportedPeople getById(Integer id) {
		Optional<SupportedPeople> staff = repository.findById(id);
		
		if (staff.isPresent()) {
			return staff.get();
		}
		return new SupportedPeople();
	}
	
	public SupportedPeople add(SupportedPeople staff) {
		return repository.save(staff);
	}

}
