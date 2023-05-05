package com.hdfc.data.poc.data.migration.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.hdfc.data.poc.data.migration.postgres.repository",
        entityManagerFactoryRef = "postgresEntityManagerFactory",
        transactionManagerRef = "postgresTransactionManager")
public class PostgresDataSourceConfiguration {
    @Bean
    @ConfigurationProperties("spring.datasource.postgres")
    public DataSourceProperties postgresDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.postgres.configuration")
    public DataSource postgresDataSource() {
        return postgresDataSourceProperties()
                .initializeDataSourceBuilder()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "postgresEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean postgresEntityManagerFactoryBean(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(postgresDataSource())
                .packages("com.hdfc.data.poc.data.migration.postgres.entity")
                .build();
    }

    @Bean(name = "postgresTransactionManager")
    public PlatformTransactionManager postgresPlatformTransactionManager(
            final @Qualifier("postgresEntityManagerFactory") LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean
    ) {
        return new JpaTransactionManager(containerEntityManagerFactoryBean.getObject());
    }
}
