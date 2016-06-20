package cn.itcast.jersey.swagger;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.springframework.context.annotation.Configuration;

import cn.itcast.jersey.swagger.server.DemoServer;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.models.Contact;
import io.swagger.models.Info;

@Configuration
public class SwaggerBeanConfig extends Application {

	public SwaggerBeanConfig() {
		//######################### Swagger 配置 ########################
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setBasePath("/jersey");
		beanConfig.setTitle("风云科技RESTFul风格API");
		beanConfig.getSwagger().setInfo(getJerseySwaggerInfo());
		beanConfig.setDescription("Jersey Swagger API文档");
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("127.0.0.1:8080");
        beanConfig.setBasePath("/jersey");
        beanConfig.setResourcePackage("cn.itcast.jersey.swagger.server");
        beanConfig.setScan(true);
	}
	
	/*
	 * 基本信息
	 */
	private Info getJerseySwaggerInfo() {
		Contact contact = new Contact(); 
		contact.setName("张田");
		contact.setUrl("http://my.oschina.net/wangnian");
		contact.setEmail("2251181679@qq.com");
		
		Info info = new Info() ;
		info.setContact(contact);
		info.setVersion("2.0.0");
		return info ;
	}
	
	@Override
    public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(DemoServer.class) ;
		return resources ;
    }
}
