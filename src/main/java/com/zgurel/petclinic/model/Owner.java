package com.zgurel.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Owner {
	private Long id;
	private String firstName;
	private String lastName;
	
	private Set<Pet> pets = new HashSet<>();
	
	
}
