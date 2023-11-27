package com.bakery.demo.config;
 
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("com.bakery.demo.model")
@ComponentScan("com.bakery.demo.service")
@EnableJpaRepositories("com.bakery.demo.repository")
@EnableTransactionManagement
public class DomainConfig {
}
