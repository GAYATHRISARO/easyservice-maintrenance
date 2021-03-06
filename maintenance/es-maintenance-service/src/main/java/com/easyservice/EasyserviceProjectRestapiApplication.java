package com.easyservice;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.easyservice.model.Priority;
import com.easyservice.model.Status;
import com.easyservice.model.Task;
import com.easyservice.service.IMaintenanceService;

/**
 * @author GAYATHRI S
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EasyserviceProjectRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EasyserviceProjectRestapiApplication.class, args);
	}

	@Autowired
	IMaintenanceService maintenanceService;
	
	
	@Override
	public void run(String... args) throws Exception {
    	LocalDate startDate=LocalDate.parse("2021-10-07");
		LocalDate endDate=LocalDate.parse("2021-10-11");
		
		Status status=Status.valueOf("COMPLETED");
		Priority priority=Priority.valueOf("HIGH");
		

		
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}

}
