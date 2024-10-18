package com.example.Jpasample.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Builder;
import lombok.Data;


@Data
@Entity
@Builder
@Table(name="student_records",
uniqueConstraints = {
		@UniqueConstraint(columnNames = "name",name = "student_name")
})
public class Student {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int student_id;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false,length = 500)
	private String name;
	@Column(nullable = false,length = 2000)
	private String school;
	

}
