package com.javatar2.logging.config;


import com.javatar2.logging.aop.LoggingAspec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
class LoggingAspecConfiguration {

    @Bean
    public LoggingAspec logAspect() {
        return new LoggingAspec();
    }
}
