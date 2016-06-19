package cn.itcast.jersey.swagger;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注册Jersey访问
 */
@Configuration
public class JerseySpringConfig {
	@Bean
    public ServletRegistrationBean jerseyServlet() {
		// 注意匹配路径不要是/*，这样会将swagger的访问路径http://127.0.0.1/swagger-ui.html拦截，直接进入到hersy服务了
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/jersey/*");
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, RestJaxRsApplication.class.getName());
        return registration;
    }
}
