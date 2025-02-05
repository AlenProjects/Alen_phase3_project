package com.assignment.cabservice.config;
import org.springframework.context.annotation.Bean;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis((java.util.function.Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("com.assignment.cabservice.controller"))
                .paths((java.util.function.Predicate<String>) PathSelectors.any())
                .build();
    }
}
