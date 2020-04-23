package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCursor;

import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class RestApplication {

	/**
	 * main method that runs the rest application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

	@Autowired
	private MongoClient mongoClient;

	/**
	 * ensures that there will no be CORS restrictions
	 * view more https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
	 * @return
	 */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*")
				.allowedMethods("*").allowedOrigins("*");
			}
		};
	}

	/**
	 * Creates mongo templates
	 * @return map of templates
	 */
	public Map<String, MongoTemplate> getMongoTemplates() throws Exception {
		MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
		Map<String, MongoTemplate> mongoTemplates = new HashMap<String, MongoTemplate>();
		while(dbsCursor.hasNext()) {
			String dbName = dbsCursor.next();
			MongoDbFactory mongo = new SimpleMongoDbFactory(mongoClient, dbName);
			mongoTemplates.put(dbName, new MongoTemplate(mongo));
		}
		return mongoTemplates;
	}

}
