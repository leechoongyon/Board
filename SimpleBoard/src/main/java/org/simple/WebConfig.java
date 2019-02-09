package org.simple;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.simple.interceptor.AuthInterceptor;
import org.simple.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter
{
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	@Autowired
	private AuthInterceptor authInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		List<String> authPathPatterns = new ArrayList<String>();
		authPathPatterns.add("/sboard/register");
		authPathPatterns.add("/sboard/modifyPage");
		authPathPatterns.add("/sboard/removePage");
		authPathPatterns.add("/sboard/list");
		
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns("/user/loginPost");
		registry.addInterceptor(authInterceptor)
				.addPathPatterns(authPathPatterns);
	}
}
