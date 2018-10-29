package com.cuixb.eureka_server0;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
public class App {

    public static void main(String[] args) {
        new SpringApplicationBuilder(App.class).web(true).run(args);
    }

}
