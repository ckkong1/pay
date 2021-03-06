package com.pay.paas;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
@MapperScan("com.pay.paas.dao")
public class PaasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaasApplication.class, args);
	}
}
