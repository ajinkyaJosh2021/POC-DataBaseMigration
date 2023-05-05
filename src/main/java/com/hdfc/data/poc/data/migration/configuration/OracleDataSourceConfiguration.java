package com.hdfc.data.poc.data.migration.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.hdfc.data.poc.data.migration.oracle.repository",
        entityManagerFactoryRef = "oracleEntityManagerFactory",
        transactionManagerRef = "oracleTransactionManager")
public class OracleDataSourceConfiguration {
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.oracle")
    public DataSourceProperties oracleDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.oracle.configuration")
    public DataSource oracleDataSource() {
        return oracleDataSourceProperties()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "oracleEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean oracleEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(oracleDataSource())
                .packages("com.hdfc.data.poc.data.migration.oracle.entity")
                .build();
    }

    @Bean(name = "oracleTransactionManager")
    @Primary
    public PlatformTransactionManager oraclePlatformTransactionManager(
            final @Qualifier("oracleEntityManagerFactory") LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean
    ) {
        return new JpaTransactionManager(containerEntityManagerFactoryBean.getObject());
    }
}
