package com.example.demo.ProjectAha.Models;
	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.Id;

	@Entity
	public class Model1 {
	    @Id
	    @GeneratedValue
	    private Long id;
	    private String eventname;
	    private String place;
	    private String date;

	    public Long getId()
	    {
	        return id;
	    }

	    public void setId(Long id) {

	        this.id = id;
	    }

	    public String getEventName() {

	        return eventname;
	    }

	    public void setEventName(String eventname) {

	        this.eventname = eventname;
	    }

	    public String getPlace() {
	        return place;
	    }

	    public void setPlace(String place) {
	        this.place = place;
	    }

	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }
	}


