package com.inti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//import com.inti.service.impl.AppUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
/*	@Autowired
	private AppUserDetailsService userDetailsService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
*/
	/*
	 * protected void configure(HttpSecurity http) throws Exception{ http
	 * .authorizeRequests() .anyRequest().authenticated() .and() .formLogin()
	 * .permitAll() .and() .logout() .logoutUrl("/logout") .permitAll() .and()
	 * .httpBasic() .and() .csrf().disable(); }
	 */
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		http.formLogin();
//		http.authorizeRequests().anyRequest().hasAuthority("admin");
//		http.addFilter(new JWTAuthentificationFilter(authenticationManager()));
//		http.addFilterBefore(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
//	}

	 @Override
	    public void configure(HttpSecurity http) throws Exception {
	       http.csrf().disable().authorizeRequests()
	       	.antMatchers("/").permitAll()
	         .antMatchers(HttpMethod.GET,"/*").permitAll()
	         .antMatchers(HttpMethod.GET,"/*/*").permitAll()
	         .antMatchers(HttpMethod.POST,"/*").permitAll()
	         .antMatchers(HttpMethod.PUT,"/*/*").permitAll()
	         .antMatchers(HttpMethod.DELETE,"/*/*").permitAll()
	        .anyRequest().authenticated();
	    }
	
}
