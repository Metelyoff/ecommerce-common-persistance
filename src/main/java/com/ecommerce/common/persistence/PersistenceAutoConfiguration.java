package com.ecommerce.common.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ecommerce.common.persistence")
@EntityScan(basePackages = "com.ecommerce.common.persistence.entities")
//@EnableJpaRepositories(basePackages = "com.ecommerce.common.persistence.repositories")
public class PersistenceAutoConfiguration {
}
