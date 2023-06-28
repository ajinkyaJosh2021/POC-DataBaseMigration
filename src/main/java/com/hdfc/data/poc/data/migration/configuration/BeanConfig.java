package com.hdfc.data.poc.data.migration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class BeanConfig {

    @Bean(name = "threadPoolForPubSub")
    public ThreadPoolExecutor getAsyncExecutor() {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(30,35,10l, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        return executor;
    }
}
