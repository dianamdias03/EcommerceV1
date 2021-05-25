package com.ecommerce.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Adress implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long adressId;
	
	@ManyToOne
	@JoinColumn(name="costumerId")
	private Costumer costumer;
	
	@Column(length = 8)
	private String cep;
	
	@Column(length = 2)
	private String state;
	
	@Column(length = 40)
	private String city;
	
	@Column(length = 40)
	private String neighbor;
	
	@Column(length = 1000)
	private String complement;
	
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public Long getAdressId() {
		return adressId;
	}
	public void setAdressId(Long adressId) {
		this.adressId = adressId;
	}
	public Costumer getCostumer() {
		return costumer;
	}
	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighbor() {
		return neighbor;
	}
	public void setNeighbor(String neighbor) {
		this.neighbor = neighbor;
	}
	
	
	
}