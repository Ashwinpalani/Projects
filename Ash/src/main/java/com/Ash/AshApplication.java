package com.Ash;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@SpringBootApplication
public class AshApplication {

	
	public static void main(String[] args) throws IOException {
//		 ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AshApplication.class)
//	                .properties(
//	                        "spring.config.location:classpath:C:\\Users\\User\\Downloads\\AKPROJECT\\AKPROJECT\\src\\main\\resources\\out.properties")
//	                .build().run(args);
//		 ConfigurableEnvironment environment = applicationContext.getEnvironment();
//		 SpringApplication application = new SpringApplication(AkprojectApplication.class); // application.setBannerMode(Banner.Mode.OFF);
		 SpringApplication application = new SpringApplication(AshApplication.class);
		System.setProperty("spring.config.location",
				"C:\\Users\\User\\Downloads\\AKPROJECT\\AKPROJECT\\src\\main\\resources\\out.properties");
		
//		Resource resource = new ClassPathResource("/out.properties");
//		Properties props = PropertiesLoaderUtils.loadProperties(resource);
//		System.err.println(props.getProperty("sub"));
		
		application.run(args);
		
//		
//		Properties props3 = PropertiesLoaderUtils.loadAllProperties("out.properties");
//		PropertyPlaceholderConfigurer props2 = new PropertyPlaceholderConfigurer();
//		props2.setProperties(props3);
	}

}
