package com.ltlg.erplab.config;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.ltlg.erplab.repository.UserRepository;
import com.ltlg.erplab.service.CustomUserDetailsService;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.cors().configurationSource(new CorsConfigurationSource() {
			@Override
			public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
				CorsConfiguration corsConfiguration = new CorsConfiguration().applyPermitDefaultValues();
				ArrayList<String> allowedOrigins = new ArrayList<>();
				ArrayList<String> allowedMethods = new ArrayList<>();
				
				allowedMethods.add("GET");
				allowedMethods.add("POST");
				allowedMethods.add("PUT");
				allowedMethods.add("DELETE");
				allowedOrigins.add("*");
				
				corsConfiguration.setAllowedOrigins(allowedOrigins);
				corsConfiguration.setAllowedMethods(allowedMethods);
				corsConfiguration.addAllowedHeader("*");
				return corsConfiguration;
			}
		});
		http.csrf().disable();
		/*
		 * Login desactivado por practicidad.
		 * http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
		 */
	}

	private PasswordEncoder getPasswordEncoder() {
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence charSequence) {
				return charSequence.toString();
			}

			@Override
			public boolean matches(CharSequence charSequence, String s) {
				return true;
			}
		};
	}
	
}
