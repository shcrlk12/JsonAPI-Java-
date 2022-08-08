package com.example.demo.jsonapi.entity;

import java.util.List;

import com.example.demo.jsonapi.annotation.ToMany;
import com.example.demo.jsonapi.annotation.ToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Comment extends ResourceObject{
	String id;
	String body;
	
	@ToOne("articles") Article articles; 
	@ToOne("people") Person people; // ToOne은 type 이름으로
}
