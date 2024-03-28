package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class StoringData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;
    private double temp;

    private int humidity;
    
    private double wind;

  

    public StoringData() {
    }



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public double getTemp() {
		return temp;
	}



	public void setTemp(double temp) {
		this.temp = temp;
	}



	public double getHumidity() {
		return humidity;
	}



	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}



	public double getWind() {
		return wind;
	}



	public void setWind(double wind) {
		this.wind = wind;
	}



	public StoringData(Long id, String city, double temp, int humidity, double wind) {
		super();
		this.id = id;
		this.city = city;
		this.temp = temp;
		this.humidity = humidity;
		this.wind = wind;
	}
	@ManyToOne
    @JoinColumn(name = "user_id")
	private UserRegister user;
     

}