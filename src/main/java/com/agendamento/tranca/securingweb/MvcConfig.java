package com.agendamento.tranca.securingweb;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MvcConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
			http
				    .csrf().disable()
					.authorizeRequests()
					.antMatchers("/admin").hasRole("manager")
					.and()
					.formLogin();
	}
	

	
}