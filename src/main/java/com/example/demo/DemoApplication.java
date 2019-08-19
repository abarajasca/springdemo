package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(ApplicationRepository repository){
//		return 	(args) -> {
//			repository.save(new Application("Trackzilla","Juan Perez","Ticket application"));
//			repository.save(new Application("Mockito","Antonio Barcenas","Mocking application"));
//
//			for (Application application : repository.findAll()){
//				log.info("The application is " + application.toString());
//			}
//		};
//	}

}
