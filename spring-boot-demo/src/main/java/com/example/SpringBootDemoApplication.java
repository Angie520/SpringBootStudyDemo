package com.example;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 在这里我们使用@SpringBootApplication指定这是一个spring boot的应用程序
 * @author GB
 *
 */
@SpringBootApplication
public class SpringBootDemoApplication extends WebMvcConfigurerAdapter {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>>converters) {
		super.configureMessageConverters(converters);

		/**
		 * 这里是为了使用我们自己定义的fastjson框架。
		 * 1.需要先定义一个convert转换消息的对象；
		 * 2.添加fastjson配置信息，比如：是否要格式化返回的json数据
		 * 3.在convert中添加配置信息。
		 * 4.将convert添加到converters当中。
		 */
		// 1.需要先定义一个convert转换消息的对象；
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		// 2.添加fastjson配置信息，比如：是否要格式化返回的json数据
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 3.在convert中添加配置信息。
		fastConverter.setFastJsonConfig(fastJsonConfig);
		// 4.将convert添加到converters当中。
		converters.add(fastConverter);
	}


	public static void main(String[] args) {

		/**
		 * 在main方法进行启动我们的应用程序
		 */
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
