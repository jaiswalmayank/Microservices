package com.quick.carpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.quick.carpool.billing.proxy")
public class QuickCarPoolBillingServiceStarter 
{
    public static void main( String[] args )
    {
        SpringApplication.run(QuickCarPoolBillingServiceStarter.class, args);
    }
}
