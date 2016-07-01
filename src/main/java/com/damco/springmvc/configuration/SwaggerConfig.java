package com.damco.springmvc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger
public class SwaggerConfig {

	private SpringSwaggerConfig springSwaggerConfig;
	
	/**
     * Setting spring swagger configuration.
     *
     * @param springSwaggerConfig
     */
    @Autowired
    public void setSpringSwaggerConfig(final SpringSwaggerConfig springSwaggerConfig) {
	this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    public SwaggerSpringMvcPlugin allAPIImplementation() {
	return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo("Spring Framework APIs")).includePatterns(".*newuser.*");
    }

    private ApiInfo apiInfo(final String title) {
	return new ApiInfo(title, "", "", "", "", "");

    }
}
