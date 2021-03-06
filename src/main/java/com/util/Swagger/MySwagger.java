package com.util.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


    @Configuration
    @EnableSwagger2 //Loads the spring beans required by the framework
    public class MySwagger {


 @Bean
    public Docket userApi() {
return new Docket(DocumentationType.SWAGGER_2).select()// 选择那些路径和api会生成document
        .apis(RequestHandlerSelectors.any()) // 对所有api进行监控
.paths(PathSelectors.any()) // 对所有路径进行监控
.build();
}
    @Bean
    public RequestMappingInfoHandlerMapping requestMapping(){
    return new RequestMappingHandlerMapping();
}


        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("鱼儿飞项目接口文档")
                    .description("鱼儿飞项目接口测试")
                    .version("1.0.0")
                    .termsOfServiceUrl("")
                    .license("")
                    .licenseUrl("")
                    .build();
        }
}
