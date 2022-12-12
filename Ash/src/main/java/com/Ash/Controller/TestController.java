package com.Ash.Controller;

import java.util.Map;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Ash.AshApplication;

@RestController
@Configuration
@RequestMapping("/test/")

public class TestController {
	@Autowired
    AshApplication Ash;
	@Autowired
	Calculator cal;
	@Value("${spring.config.active:default}")
	String vals;
	
	@Autowired
	private Environment env;

	

	Logger log = LogManager.getLogger("Calculation");

	@GetMapping(value = "testAPI")
	public ResponseEntity<?> testAPI(@RequestParam Map<String, String> requestParams) throws Exception {
		System.out.println(requestParams);
		try {

			log.debug("testAPI started: " + requestParams);
			log.info("testAPI started: " + requestParams);
			String operation = requestParams.get("operation");
			int a = Integer.parseInt(requestParams.get("a"));
			int b = Integer.parseInt(requestParams.get("b"));
			String result = String.valueOf(cal.prop(operation, a, b));
			requestParams.put("result :", result + "");
			requestParams.put("Status:", "success");
			log.debug("testAPI started: " + requestParams);
			log.info("testAPI started: " + requestParams);

		} catch (Exception e) {
			log.error("testAPI Eror: " + e);
		}
		return new ResponseEntity<>(requestParams, HttpStatus.OK);
	}

	@GetMapping(value = "loadProperty")
	public ResponseEntity<?> loadProperty(@RequestParam Map<String,String> input) throws Exception {
		//String property=null;
//		String property = env.getProperty(input.get("sub"));
//		System.out.println(property);
//		try {
//			System.out.println(input.get("sub"));
//			String property = env.getProperty(input.get("sub"));
//			
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		return new ResponseEntity<>(vals, HttpStatus.OK);
	}

	@GetMapping(value = "htmls")
	public ResponseEntity<?> web(@RequestParam Map<String,String> name)
	{
		 name.put("Ashwin","1");
		Properties names  = System.getProperties();
		
		System.out.println(names);
		 
		return new ResponseEntity<>(name, HttpStatus.OK);
		
	}
	
	@GetMapping("/uri")
	public ResponseEntity<?> read() {
		String tut = null;
		try {
		String tutorial = env.getProperty("url");
		RestTemplate template = new RestTemplate();
	    tut = template.getForObject(tutorial, String.class);
		System.out.println(tut);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(tut, HttpStatus.OK);
	}

}