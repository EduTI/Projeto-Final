package br.com.eduardo.cadastro;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<FacesServlet> servletRegistration() {
		return new ServletRegistrationBean<FacesServlet>(new FacesServlet(), "*.xhtml");
	}
}
