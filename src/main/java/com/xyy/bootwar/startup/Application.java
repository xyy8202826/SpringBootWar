package com.xyy.bootwar.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.xyy.bootwar.dao"})
@EntityScan(basePackages="com.xyy.bootwar.model")
@ComponentScan("com.xyy.bootwar")
public class Application extends SpringBootServletInitializer{
	 @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(Application.class);
	  }
	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(Application.class, args);
	    }
}
