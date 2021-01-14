package com.example.springsandal.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * This is the class that connects the Spring Boot application to the
 * interactive UI created by Swagger.  I am setting the documentation
 * type to OAS 3.0.
 *
 * @author David Novogrodsky
 */
@Configuration
public class SpringFoxConfig {
  @Value("${swagger.enable}")
  private boolean isEnableSwagger;

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.OAS_30)
        .select()
        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.any())
        .build()
        .enable(isEnableSwagger);
  }
}
