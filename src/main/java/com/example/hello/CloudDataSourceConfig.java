package com.example.hello;

import javafx.application.Application;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.cloud.app.ApplicationInstanceInfo;
import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

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

    /*@Bean
    public DataSource dataSource() {
        return connectionFactory().dataSource();
    }*/

    @Bean
    public ApplicationInstanceInfo applicationInfo() {
        return cloud().getApplicationInstanceInfo();
    }

    /*@Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        URI dbUri = new URI(System.getenv("DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(dbUrl);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);

        return basicDataSource;
    }*/

}
