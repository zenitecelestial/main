package br.com.consultaCep.consultaCepBR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class ConsultaCepBrApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsultaCepBrApplication.class, args);
	}

}
