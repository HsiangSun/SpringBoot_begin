package cn.hsiangsun.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
//@PropertySource("classpath:application.properties")
//@EnableConfigurationProperties(JdbcConfig.class)
public class Config {

   /* @Value("${jdbc.url}")
    String url;

    @Value("${jdbc.jdbc.driver}")
    String driver;

    @Value("${jdbc.user}")
    String user;

    @Value("${jdbc.pswd}")
    String pass;*/

    /*@Bean
    public DataSource dataSource(JdbcConfig properties){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(properties.getDriver());
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUser());
        dataSource.setPassword(properties.getPass());

        return dataSource;
    }*/

    @Bean
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
        return new DruidDataSource();
    }
}
