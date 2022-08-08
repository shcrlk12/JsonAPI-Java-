package com.example.demo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Repository
@Setter
@Getter
public class DbMgr {
	@Autowired 
	JdbcTemplate jt;
	  
	public List<Map<String, ?>> selectAll() {
	    
		return jt.query("select * from article", (rs, rowNum) -> {
		  Map<String, Object> mss = new HashMap<>();
		  mss.put("id", rs.getInt(1));
		  mss.put("title", rs.getString(2));
		  mss.put("peopleId", rs.getInt(3));
		  return mss;
	    });
	}
	
	public List<Map<String, ?>> selectIdFromTable(String id, String table) {
		System.out.println(String.format("select * from %s where id = '%s'", table, id));
		return jt.query("select * from article", (rs, rowNum) -> {
		  Map<String, Object> mss = new HashMap<>();
		  mss.put("id", rs.getInt(1));
		  mss.put("title", rs.getString(2));
		  mss.put("peopleId", rs.getInt(3));
		  return mss;
	    });
	}
	
	
	public List<Map<String, ?>> selectAllIdFromTable(String table, String colName, String value, Class<?> clazz) {
		return jt.query(String.format("select * from %s where %s = '%s'", table, colName, value), (rs, rowNum) -> {
			Map<String, Object> mss = new HashMap<>();
			Field[] fields = clazz.getDeclaredFields();
			
			for(Field field : fields) {
				String fieldName = field.getName();
				try {
					int colIndex = rs.findColumn(fieldName); // colum이 존재하면
					mss.put(fieldName, rs.getObject(colIndex));
				}
				catch(Exception e) {
					
				}
			}
		  return mss;
	    });
	}
}
