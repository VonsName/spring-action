package com.von.spaction.di;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * @author vons0
 */
@Configuration
@Profile(value = "prod")
public class ProdProfileConfig {

    @Bean
    public MyProd prod() {
        return new MyProd();
    }

    @Bean
    @Profile("dev")
    public DataSource dataSource() {
        return new DruidDataSource();
    }
}
