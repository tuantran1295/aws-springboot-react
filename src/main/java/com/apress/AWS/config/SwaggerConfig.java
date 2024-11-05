package com.apress.AWS.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
	@Bean
	public GroupedOpenApi productApi() {
		return GroupedOpenApi.builder()
				.group("springshop-public")
	            .pathsToMatch("/**")
	            .build();
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
		// http://localhost:8080/swagger-ui/index.html
	}
}

