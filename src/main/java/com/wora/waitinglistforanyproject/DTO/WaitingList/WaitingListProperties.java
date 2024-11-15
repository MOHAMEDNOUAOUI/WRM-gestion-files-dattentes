package com.wora.waitinglistforanyproject.DTO.WaitingList;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Configuration
@ConfigurationProperties(prefix = "waiting-list")
public class WaitingListProperties {
    private String algorithm;
    private Integer capacity;
}
