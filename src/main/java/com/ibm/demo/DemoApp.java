package com.ibm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import com.ibm.util.Utils;

@SpringBootApplication
@EnableEurekaServer
public class DemoApp {
	public static void main( String[] args ) {
		System.out.println( Utils.sayHello() );

		SpringApplication.run( DemoApp.class, args );
	}
}