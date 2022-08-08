package com.example.demo.jsonapi.entity;

import java.util.List;
import com.example.demo.jsonapi.annotation.Resource;
import com.example.demo.jsonapi.annotation.ToMany;
import com.example.demo.jsonapi.annotation.Type;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Resource({"author", "people"})
@Type("people")
public class Person extends ResourceObject{
	String id;

	String firstName;
	String lastName;
	String twitter;
	
	@ToMany("articles") List<Article> articles; 
	@ToMany("comments") List<Comment> comments;

}

//1. id type으로 하나 조회하고
//2. 연관된애들 차례대로 조회해서 저장.