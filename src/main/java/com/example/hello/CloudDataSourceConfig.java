package com.example.hello;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by Anthony on 9/26/2015.
 * This is the config code that will generate the configuration file at runtime
 *
 * You can call the Profile whatever you want AS LONG AS that name matches ...
 *
 * Everything about this should be super easy and automated so enjoy!
 * And as always, Don't forget to flick the bean
 */

@Configuration
@ServiceScan
@Profile("cloud")
public class CloudDataSourceConfig extends AbstractCloudConfig {

    @Bean
    public DataSource dataSource() {
        return connectionFactory().dataSource();
    }

}
