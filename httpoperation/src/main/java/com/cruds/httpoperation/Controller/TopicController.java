package com.cruds.httpoperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/")
public class TopicController {
	
	@Autowired
	TopicService ts; 
	
	
  @RequestMapping("/get")
  public List<Topics> getAll(List<Topics> t)
  {
	return ts.getAllTopics();
	  
  }
 @RequestMapping("/get/{id}")
  public Topics getSubject(@PathVariable String id)
  
  {
	return ts.getSpecifiedTopics(id);
	   
  }
}
