package com.example.demo.controller;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DbMgr;
import com.example.demo.JsonApi;
import com.example.demo.JsonApiHelper;
import com.example.demo.jsonapi.annotation.ToMany;
import com.example.demo.jsonapi.annotation.ToOne;
import com.example.demo.jsonapi.entity.Article;
import com.example.demo.jsonapi.entity.Comment;
import com.example.demo.jsonapi.entity.Person;
import com.example.demo.jsonapi.model.Data;

@RestController
public class MainController {

	@Autowired
	private JsonApiHelper jsonApiHelper;

	@GetMapping("/articles/1")
	public JsonApi index(HttpServletRequest request)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		jsonApiHelper.setKey("1", "article");
//		String id = "1", type = "article";
//		JsonApi jsonApi = new JsonApi();
//
//		List<Map<String, ?>> result = dbMgr.selectAll();
//		Article article = new Article();
//
//		// 1. id, type으로 Data 가져오기
//		for (Map<String, ?> s : result) {
//			System.out.println(s.get("id"));
//			System.out.println(s.get("title"));
//			article.setTitle((String) s.get("title"));
//		}
//
//		// 2. 연관된 놈들 데이터 가져오기
//		Field[] fields = Article.class.getDeclaredFields();
//		System.out.println(fields.length);
//
//		// 3. Map에 Class랑 type이랑 쌍으로 매치시켜서 놓고. 타입으로 Class 찾은다음에.
//		for (Field field : fields) {
//			System.out.println(field.getName());
//
//			Annotation[] annotations = field.getAnnotations();
//
//			for (Annotation annotation : annotations) {
//				if (annotation instanceof ToMany) {
//					ToMany myAnnotation = (ToMany) annotation;
//					System.out.println("value: " + myAnnotation.value());
//					// 1. comments테이블에 articleid로 조회
//					// 2. type, ClassName(TableName) 쌍으로 이루어진 map에서 조회하느것.
//
//					List<Map<String, ?>> result2 = dbMgr.selectAllIdFromTable("comment", "articleId", "1", Comment.class);
//
//					for (Map<String, ?> s : result2) {
//						System.out.println(s.get("id"));
//						System.out.println(s.get("body"));
//					}
//
//					
//				} else if (annotation instanceof ToOne) {
////		        	ToOne myAnnotation = (ToOne) annotation;
////		            System.out.println("value: " + myAnnotation.value());
////		            //1. peopleId로 peopel테이블에서 조회
////		            //2. type, ClassName(TableName) 쌍으로 이루어진 map에서 조회하느것.
////		            Person p = new Person();
////
////		            List<Map<String, ?>> result2 = dbMgr.selectIdFromTable(id, "person");
////		            
////		            Field f = p.getClass().getDeclaredField("firstName");
////		            f.setAccessible(true);
////		            f.set(p, "jeongwond");
////		            f.setAccessible(false);
////		            
////		            System.out.println(p.getFirstName());
//
//				}
//			}
//		}

		return jsonApiHelper.Ok();
//		return new JsonApiHelper().setKey("1", "articles");
	}
}
