package com.example.demo.entity;
public class WeatherData
{
	  private Main main;
	  private Wind wind;
	  private Weatherr[] weather;
	  private String name;
	  
	  public Main getMain() {
		  return main;
	  }
	  public void setMain(Main main)
	  {
		  this.main=main;	  
	  }
	  public Wind getWind()
	  {
		  return wind;
	  }
	  public Weatherr[] getWeather()
	  {
		  return weather;
	  }
	  public void seTWeather(Weatherr[] weather)
	  {
		  this.weather=weather;
	  }
	  public String getName()
	  {
		  return name;
	  }
	  public void setName(String name)
	  {
		  this.name = name;
	  }

}