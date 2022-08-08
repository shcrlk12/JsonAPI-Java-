package com.example.demo;

import java.util.List;

import com.example.demo.jsonapi.model.Data;
import com.example.demo.jsonapi.model.Error;
import com.example.demo.jsonapi.model.Included;
import com.example.demo.jsonapi.model.Link;
import com.example.demo.jsonapi.model.Meta;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonApi {
	Data data;
	Error error;
	Meta meta;
	
	List<Link> links;
	Included included;

	public void setObject() {
		
	}
	public void Ok(){
		
	}
}
