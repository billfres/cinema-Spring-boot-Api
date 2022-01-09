package com.fresnel.cinema.dao;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Cinema /*implements Serializable*/{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double longitude, latitude, altitude;
	private int nombreSalles;

}
