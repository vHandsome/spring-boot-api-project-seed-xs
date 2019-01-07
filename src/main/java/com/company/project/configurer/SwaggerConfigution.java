package com.company.project.configurer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 配置swagger-ui接口文档
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigution extends WebMvcConfigurerAdapter {

	@Value("${swagger2.enable}")
	private boolean swagger2Enable;

	@Bean
	public Docket createApi() {
		return new Docket(DocumentationType.SWAGGER_2).enable(swagger2Enable).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.company.project")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("API接口测试文档")
				.description("RESTful风格接口")
				.version("1.0")
				.contact(new Contact("xs", "http://www.xxx.com", "609745112@qq.com"))
				.build();
	}
}
