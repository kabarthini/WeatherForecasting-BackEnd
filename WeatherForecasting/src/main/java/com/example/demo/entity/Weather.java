package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="weather1")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Weather {
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private int weatherId;
	   private String celcius;
	   private String name;
	   private String humidity;
	   private String speed;
	   
	   
	   
}
