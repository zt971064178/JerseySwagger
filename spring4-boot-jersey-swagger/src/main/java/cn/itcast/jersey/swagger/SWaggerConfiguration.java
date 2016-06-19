package cn.itcast.jersey.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration 
@EnableSwagger2 
public class SWaggerConfiguration {
	/** * 可以定义多个组，比如本类中定义把test和demo区分开了 * （访问页面就可以看到效果了） * */ 
	@Bean   
	public Docket testApi(){   
			// return new Docket(DocumentationType.SWAGGER_2);   
		return new Docket(DocumentationType.SWAGGER_2) 
					.groupName("server") 
					.genericModelSubstitutes(DeferredResult.class) 
					// .genericModelSubstitutes(ResponseEntity.class) 
					.useDefaultResponseMessages(false) 
					.forCodeGeneration(true)// api测试请求地址 
					.pathMapping("/")// base，最终调用接口后会和paths拼接在一起 
					.select() 
					//.paths(PathSelectors.regex("/spring/*")) // 过滤的接口 
					.build() 
					.apiInfo(testApiInfo()) ; 
	}   

	private ApiInfo testApiInfo() { 
		    Contact contact = new Contact("张田", "http://my.oschina.net/wangnian", "2251181679@qq.com"); 
		    ApiInfo apiInfo = new ApiInfo("某API接口",//大标题 
		            "REST风格API",//小标题 
		            "0.1",//版本 
		            "www.baidu.com", 
		            contact,//作者 
		            "主页",//链接显示文字 
		            ""//网站链接 
		    ); 
		    return apiInfo; 
	} 
}
