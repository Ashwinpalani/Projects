package com.example.db.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Entity;

@Entity
@Table(name="tutorials")
public class JpaTutorials {

	  @Id
	  private long id;
	  
	  @Column(value="title")
	  private String title;
	  
	  @Column(value="description")
	  private String description;
	  
	  @Column(value="published")
	  private boolean published;
	  
	  public JpaTutorials() {

	  }
	  
	  public JpaTutorials(long id, String title, String description, boolean published) {
	    this.id = id;
	    this.title = title;
	    this.description = description;
	    this.published = published;
	  }

	  public JpaTutorials(String title, String description, boolean published) {
	    this.title = title;
	    this.description = description;
	    this.published = published;
	  }
	  
	  public void setId(long id) {
	    this.id = id;
	  }
	  
	  public long getId() {
	    return id;
	  }

	  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public void setDescription(String description) {
	    this.description = description;
	  }

	  public boolean isPublished() {
	    return published;
	  }

	  public void setPublished(boolean isPublished) {
	    this.published = isPublished;
	  }

	  @Override
	  public String toString() {
	    return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	  }

	}