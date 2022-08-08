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
	
	public JsonApi setKey(String id, String type) {
		JsonApi jsonApi = new JsonApi();
		
		dbMgr.selectAll();
		
		//1. id, type으로 Data 가져오기
		jsonApi.setData(new Data());
		
		//2.
		ResourceObject ro = new ResourceObject();
		
		return null;
	}
	
	private void test() {
		
	}
}
