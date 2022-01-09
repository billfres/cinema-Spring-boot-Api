package com.fresnel.cinema.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Salle {

	@Id
	private Long id;
	private String name;
	private int nombrePlace;
	private Cinema  cimena;
}
