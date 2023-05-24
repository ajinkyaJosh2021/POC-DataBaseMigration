package com.hdfc.data.poc.data.migration.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class BeanConfiguration {

    @Bean
    @Qualifier("threadPool")
    public ThreadPoolExecutor threadPoolExecutor(){
        return new ThreadPoolExecutor(10,15,10, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
    }
}
