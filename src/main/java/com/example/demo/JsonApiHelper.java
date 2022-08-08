package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.jsonapi.entity.ResourceObject;
import com.example.demo.jsonapi.model.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
public class JsonApiHelper {	
	@Autowired
	private DbMgr dbMgr;	
	
	private String id, type;
	private JsonApi jsonApi;
	
	public JsonApi setKey(String id, String type) {
		this.id = id;
		this.type = type;
		jsonApi = new JsonApi();		
		return null;
	}
	
	public JsonApi Ok() {
		Data data =new Data();
		
		data.setId(this.id);
		data.setType(this.type);
		
		System.out.println(this.id);
		System.out.println(this.type);
		
		jsonApi.setData(data);
		
		System.out.println(jsonApi.getData().getId());

		dbMgr.selectAll();

		//1. id, type으로 Data 가져오기
		jsonApi.setData(new Data());
		
		//2.
		ResourceObject ro = new ResourceObject();
		
		return jsonApi;
		
	}
}
