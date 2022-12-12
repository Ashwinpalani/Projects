package com.cruds.httpoperation.Controller;

import javax.persistence.Entity;

@Entity
public class Topics {
	private String id;
	private String concept;
	private String subject;
	
	public Topics(String id, String concept, String subject) {
		this.id = id;
		this.concept = concept;
		this.subject = subject;
	}
	
	public String getId() {
		return id;
	}


	public String getConcept() {
		return concept;
	}


	public String getSubject() {
		return subject;
	}


	

	
	
	

}
