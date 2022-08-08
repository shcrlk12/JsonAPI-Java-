package com.example.demo.jsonapi.model;

import com.example.demo.jsonapi.entity.ResourceObject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data {
	String type;
	String id;
	
	ResourceObject attributes;
	
}
