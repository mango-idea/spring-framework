package com.spring.test.config;

import com.spring.test.Entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Java配置
 *
 * @author : zhenghuang.wu
 * @version : v1.0
 * @date : 2021/8/10 13:07
 * @since : v1.0
 */
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user() {
		return new User("wzh", "杭州");
	}
}
