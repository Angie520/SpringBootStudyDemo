package com.example;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 在这里我们使用@RestController(等于@Controller和@RequestBody)
 * @author GB
 *
 */
@RestController
public class AbController {

	/**
	 * 在这里我们使用@RequestMapping建立请求映射
	 * http://127.0.0.1:8080/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String AbHello() {
		return "Hello";
	}

	/**
	 * Spring Boot 默认使用的json解析框架是Jackson
	 * 返回一个对象会自动转成json数据。
	 * @return
	 */
	@RequestMapping("/getDemo")
	public Demo getDemo() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setRemarks("备注啊");
		demo.setName("张三");
		demo.setCreateTime(new Date());
		return demo;
	}

}
