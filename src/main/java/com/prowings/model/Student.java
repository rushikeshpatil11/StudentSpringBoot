package com.prowings.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@javax.persistence.Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@javax.persistence.Id
	private int roll;
	private String name;
	private String gender;
	private String city;
	
	

}
