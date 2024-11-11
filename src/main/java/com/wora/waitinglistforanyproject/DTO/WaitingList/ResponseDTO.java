package com.wora.waitinglistforanyproject.DTO.WaitingList;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private Long id;
    private LocalDate date;
    private String algorithme;
    private Integer capacity;
    // the list after
}
