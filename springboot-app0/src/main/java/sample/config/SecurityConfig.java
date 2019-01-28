/*
 * Copyright 2014-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security configuration.
 *
 * @author Rob Winch
 * @author Vedran Pavic
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// @formatter:off
	// tag::config[]
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("cuixb spring security");
		http
			.authorizeRequests()
//				.requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
				.antMatchers("/api/**","/plugins/**","/cuixb/**/*.js","/cuixb/**/*.css", "/refresh").permitAll()
				.anyRequest().authenticated()
			.and()
				.formLogin()
				.permitAll()
			.and()
				.csrf().disable();//如果不disable掉csrf，第三方（postman直接调等）调用/api不会跳过authentication
	}
	// end::config[]
	// @formatter:on

}
