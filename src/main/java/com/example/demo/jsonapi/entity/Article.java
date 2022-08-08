package com.example.demo.jsonapi.entity;

import java.util.List;

import com.example.demo.jsonapi.annotation.ToMany;
import com.example.demo.jsonapi.annotation.ToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Article extends ResourceObject {
	String id;

	String title;

	@ToMany("comments") List<Comment> comments; 
	@ToOne("people") Person people;
}
