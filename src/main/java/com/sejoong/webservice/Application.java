package com.sejoong.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Bean
//	public FilterRegistrationBean encodingFilterBean() {
//		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
//		CharacterEncodingFilter charEncodingFilter = new CharacterEncodingFilter();
//		charEncodingFilter.setForceEncoding(true);
//		charEncodingFilter.setEncoding("UTF-8");
//		registrationBean.setFilter(charEncodingFilter);
//		return registrationBean;
//	}
}
