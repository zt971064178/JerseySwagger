package cn.itcast.jersey.swagger;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class RestJaxRsApplication extends ResourceConfig {
	public RestJaxRsApplication() {
	  // 向jersey框架注册资源类，凡完全限定名是以指定字符串开头的类，都将包含  全能型
	  packages("cn.itcast.jersey.swagger.server");  
	  register(JacksonFeature.class);  
      // register(RequestContextFilter.class);
      //注册数据转换器 
      // register(JacksonJsonProvider.class); 
      // Logging
      register(LoggingFilter.class); 
	}
}
