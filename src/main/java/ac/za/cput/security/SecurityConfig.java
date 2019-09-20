package ac.za.cput.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String USER_ROLE = "USERs";
    private static final String ADMIN_ROLE = "SystemAdmin";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder().encode("pass"))
                .roles(USER_ROLE)
                .and()
                .withUser("sysadmin")
                .password(passwordEncoder().encode("syspass"))
                .roles(ADMIN_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                //.anyRequest().authenticated()
                //.antMatchers(HttpMethod.GET, "indexController").authenticated()
                .antMatchers(HttpMethod.GET,"game-reserve-management/**/create/**")
                .hasRole(ADMIN_ROLE)
                //.antMatchers("reservation/**").hasAnyRole("USERs", "Sysadmin")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
