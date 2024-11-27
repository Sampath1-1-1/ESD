package com.sampath.assignment.Configuration;
import com.sampath.assignment.helper.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class CustomConfiguration implements WebMvcConfigurer {
       private final RequestInterceptor requestInterceptor;
        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            // Apply the interceptor to all endpoints except /auth/login
            registry.addInterceptor(requestInterceptor)
                    .addPathPatterns("/**")
                    .excludePathPatterns("/api/user/create", "/api/user/login");
        }
        @Bean
        public PasswordEncoder passwordEncoder(){
            return new BCryptPasswordEncoder();
        }
    }

