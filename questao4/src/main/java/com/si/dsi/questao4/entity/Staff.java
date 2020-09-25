package com.si.dsi.questao4.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Staff {
	
private static final long serialVersionUID = 2030811428002140437L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idStaff;
	private String forename;
	private String surname;
	
	@ManyToOne
	@JoinColumn(name = "id_type")
	private StaffTypes type;
	
	@OneToMany
	@JoinColumn(name = "id_staff")
	private List<Care> cares;
	
	public Integer getIdStaff() {
		return idStaff;
	}
	
	public void setIdStaff(Integer idStaff) {
		this.idStaff = idStaff;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
