package com.si.dsi.questao4.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Care implements Serializable {
	
	private static final long serialVersionUID = 2030811428002140437L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCare;
	
	@ManyToOne
	@JoinColumn(name = "id_suportted_people")
	private SupportedPeople people;
	
	public Integer getIdCare() {
		return idCare;
	}
	
	public void setIdCare(Integer idCare) {
		this.idCare = idCare;
	}
	
}
