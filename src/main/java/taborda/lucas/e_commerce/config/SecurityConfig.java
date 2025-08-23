package taborda.lucas.e_commerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // disable CSRF for APIs
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // allow all requests (for now)
                );

                // TO DO LATER, UNCOMMENT BELOW

//              .authorizeHttpRequests(auth -> auth
//                    .requestMatchers("/api/auth/**").permitAll() // login/register open
//                    .requestMatchers(HttpMethod.GET, "/api/products/**").permitAll() // anyone can view
//                    .anyRequest().authenticated() // everything else needs auth
//            )
//                    .httpBasic();

        return http.build();
    }
}
