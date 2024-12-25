package com.boot.devopstest.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.tools.DocumentationTool;

@OpenAPIDefinition(
        info = @Info(title = "devops project",
        description = "devops swagger",
        version="v1")

)
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1") //그룹 이름 설정
                .pathsToMatch("/v1/**") //경로 필터 설정
                .build();
    }

}
