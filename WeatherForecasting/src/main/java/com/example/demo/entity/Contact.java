package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor

@AllArgsConstructor
@Table(name="contact")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactId;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String message;
}
