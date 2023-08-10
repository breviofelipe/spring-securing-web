package com.brevio.securingweb;

import com.brevio.securingweb.interfaces.CabBookingService;
import com.brevio.securingweb.requests.ResquestTeste;
import com.brevio.securingweb.services.CabBookingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
public class SecuringWebApplication {


	@Bean(name = "/booking")
	HttpInvokerServiceExporter accountService() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService( new CabBookingServiceImpl() );
		exporter.setServiceInterface( CabBookingService.class );
		return exporter;

	}

	@PostMapping("/teste")
	public ResponseEntity<String> teste(@RequestBody ResquestTeste request){
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecuringWebApplication.class, args);
	}

}
