package com.quick.carpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class QuickCarPoolPaymentServiceStarter 
{
    public static void main( String[] args )
    {
        SpringApplication.run(QuickCarPoolPaymentServiceStarter.class, args);
    }
}
