package cn.itcast.jersey.swagger;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
 * SpringBootWeb配置java配置
 * 总体配置
 */
@Configuration
@EnableWebMvc
public class SpringBootWebConfiguration extends WebMvcAutoConfigurationAdapter {
	
	/*
	 * 强制转换编码
	 */
	/*@Bean
	public Filter characterEncodingFilter() {
		CharacterEncodingFilter characterEncodingFilter =new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}*/
}
