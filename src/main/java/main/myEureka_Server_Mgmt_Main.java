package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class myEureka_Server_Mgmt_Main   
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(myEureka_Server_Mgmt_Main.class, args);
	}
}