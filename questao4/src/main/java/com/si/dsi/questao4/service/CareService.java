package com.si.dsi.questao4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.dsi.questao4.entity.Care;
import com.si.dsi.questao4.respository.CareRepository;

@Service
public class CareService {
	
	@Autowired
	private CareRepository careRepository;
	
	public List<Care> getAll() {
		return careRepository.findAll();
	}
	
	public Care getById(Integer id) {
		Optional<Care> care = careRepository.findById(id);
		
		if (care.isPresent()) {
			return care.get();
		}
		return new Care();
	}
	
	public Care add(Care care) {
		return careRepository.save(care);
	}

}
