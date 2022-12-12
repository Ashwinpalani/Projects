package com.cruds.httpoperation.Controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class TopicService {
	
	@Autowired
	Topics to;
	private List<Topics> t = Arrays.asList(
			new Topics("1","Oops","java"),
			new Topics("2","Tcp","OS"),
			new Topics("3","ads","IRT"));
	
	public List<Topics> getAllTopics()
	{
		return t;
	}
	
	public Topics getSpecifiedTopics(String id)
	{
		Topics temp = null;
		for(int i=0; i<t.size(); i++)
		{
		if(id.equals(to.getId()))
			temp = t.get(i);
		}
		return temp;
	}
	
	
	public Topics update(String id)
	{
		Topics temp = null;
		for(int i=0; i<t.size(); i++)
		{
		if(id.equals(to.getId()))
			temp = t.set(i, temp);
		}
		return temp;		
	}
	
	public boolean deleteAll()
	{
		return t.removeAll(t);
		
	}
	public Topics delete(String id)
	{
		Topics temp = null;
		for(int i=0; i<t.size(); i++)
		{
		if(id.equals(to.getId()))
			temp = t.remove(i);
		}
		return temp;
		
	}
	
}
