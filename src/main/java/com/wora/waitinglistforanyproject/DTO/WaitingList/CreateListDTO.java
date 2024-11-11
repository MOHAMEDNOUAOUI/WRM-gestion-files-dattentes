package com.wora.waitinglistforanyproject.DTO.WaitingList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateListDTO {

    private LocalDate date;
    private String algorithme;
    private Integer capacity;

}
