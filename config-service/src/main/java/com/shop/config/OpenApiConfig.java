/**
 * Copyright @ of 101 Digital 2023
 */
package com.shop.config;

import java.util.Optional;

import org.springdoc.core.configuration.SpringDocConfiguration;
import org.springdoc.core.configuration.SpringDocUIConfiguration;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springdoc.core.providers.ObjectMapperProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author haitrand
 *
 */
@Configuration
public class OpenApiConfig {
	@Bean
	SpringDocConfiguration springDocConfiguration() {
		return new SpringDocConfiguration();
	}

	@Bean
	SpringDocConfigProperties springDocConfigProperties() {
		return new SpringDocConfigProperties();
	}

	@Bean
	ObjectMapperProvider objectMapperProvider(SpringDocConfigProperties springDocConfigProperties) {
		return new ObjectMapperProvider(springDocConfigProperties);
	}

	@Bean
	SpringDocUIConfiguration SpringDocUIConfiguration(
			Optional<SwaggerUiConfigProperties> optionalSwaggerUiConfigProperties) {
		return new SpringDocUIConfiguration(optionalSwaggerUiConfigProperties);
	}

//	@Bean
//	public OpenAPI usersMicroserviceOpenAPI() {
//		return new OpenAPI()
//				.info(new Info().title("Your API Title").description("Your API Description").version("1.0"));
//	}
}
