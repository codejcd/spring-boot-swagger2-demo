package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().addServersItem(new Server().url("http://localhost:8080"));
				//.components(new Components().addSecuritySchemes("basicScheme",
						//new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
						//.info(new Info().title("Spring API").version("V1")
						//.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
