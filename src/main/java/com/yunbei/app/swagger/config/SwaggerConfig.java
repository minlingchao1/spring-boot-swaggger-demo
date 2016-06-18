package com.yunbei.app.swagger.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.yunbei.app.swagger.config.properties.TestSwaggerProperties;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author: mlc
 * @dat: 2016年6月4日
 * @Description: TODO
 */
// @Configuration
// @EnableConfigurationProperties(TestSwaggerProperties.class)
// @EnableSwagger2
public class SwaggerConfig {

	@Autowired
	private TestSwaggerProperties testSwaggerProperties;

	@Bean
	public Docket testApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("test").useDefaultResponseMessages(false)
				.forCodeGeneration(true).pathMapping("/").select().paths(regex("/api/.*")).build()
				.apiInfo(testApiInfo());
	}

	private ApiInfo testApiInfo() {

		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo(testSwaggerProperties.getTitle(), testSwaggerProperties.getDescription(),
				testSwaggerProperties.getVersion(), testSwaggerProperties.getTermsOfServiceUrl(),
				testSwaggerProperties.getContact(), testSwaggerProperties.getLicense(),
				testSwaggerProperties.getLicenseUrl());
		return apiInfo;
	}
}
