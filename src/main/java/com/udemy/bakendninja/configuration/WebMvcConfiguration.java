package com.udemy.bakendninja.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.udemy.bakendninja.component.RequestTimeInterceptor;

@SuppressWarnings("deprecation")
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter{

	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor requestTimeInterceptor;
	
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(requestTimeInterceptor);
	}
}

//@Configuration
//public class WebMvcConfiguration implements WebMvcConfigurer {
//
//	@Autowired
//	@Qualifier("requestTimeInterceptor")
//	private RequestTimeInterceptor requestTimeInterceptor;
//	
//	@Override
//	public void addInterceptors(InterceptorRegistry registry){
//		registry.addInterceptor(requestTimeInterceptor);
//	}
//}