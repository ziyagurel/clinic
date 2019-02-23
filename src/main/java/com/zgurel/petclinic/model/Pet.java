package com.zgurel.petclinic.model;

import java.util.Date;
import lombok.Data;

@Data
public class Pet {
	private Long id;
	private String name;
	private Date birthDate;
	
	private Owner owner;
	
	
}
