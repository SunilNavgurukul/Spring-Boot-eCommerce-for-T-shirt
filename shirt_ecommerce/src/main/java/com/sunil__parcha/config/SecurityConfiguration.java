package com.sunil__parcha.config;

//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	DataSource dataSource;
//	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {  
//		http.authorizeRequests()  
//        .antMatchers("/").permitAll()  
//        .antMatchers("/Customer/**").permitAll()  
//        .anyRequest().authenticated();  
//	}  
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//////		Set your configuration on the auth abject
////		auth.inMemoryAuthentication().withUser("user").password("1234").roles("USER");
//////		auth.jdbcAuthentication().dataSource(dataSource)
//////		.usersByUsernameQuery(
//////			"select name,password from customer where name=?");
////			}
//
//}

//import org.springframework.context.annotation.Configuration;  
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;  
//@Configuration  
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {  
//    @Override  
//    public void configure(HttpSecurity http) throws Exception {  
//        http  
//            .authorizeRequests()  
//            .anyRequest().authenticated()  
//            .and()
//    	.formLogin()
//        .usernameParameter("username")
//        .passwordParameter("password");
//        
//        }  
//    
//}
