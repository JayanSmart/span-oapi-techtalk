package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-05-25T15:44:43.284425+02:00[Africa/Johannesburg]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("io.swagger.api"))
                    .build()
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("SPAN Tenure")
            .description("This is a simple API which is used to as a demo for using OpenAPI to define specifications.")
            .license("MIT")
            .licenseUrl("https://opensource.org/licenses/MIT")
            .termsOfServiceUrl("https://github.com/JayanSmart/span-oapi-techtalk")
            .version("0.0.1")
            .contact(new Contact("","", "jayan.smart@spandigital.com"))
            .build();
    }

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("SPAN Tenure")
                .description("This is a simple API which is used to as a demo for using OpenAPI to define specifications.")
                .termsOfService("https://github.com/JayanSmart/span-oapi-techtalk")
                .version("0.0.1")
                .license(new License()
                    .name("MIT")
                    .url("https://opensource.org/licenses/MIT"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("jayan.smart@spandigital.com")));
    }

}
