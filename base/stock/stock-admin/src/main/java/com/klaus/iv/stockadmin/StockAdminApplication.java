package com.klaus.iv.stockadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication(scanBasePackages = {"com.klaus.iv.commonjpa.config", "com.klaus.iv.stockadmin"})
@EnableDiscoveryClient
@EnableJpaAuditing(auditorAwareRef = "userAuditor")
@EnableOpenApi
public class StockAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockAdminApplication.class, args);
    }

}
