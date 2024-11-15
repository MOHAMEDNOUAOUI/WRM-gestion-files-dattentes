package com.wora.waitinglistforanyproject;

import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.WaitingListProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(WaitingListProperties.class)
public class WaitingListForAnyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaitingListForAnyProjectApplication.class, args);
    }

}
