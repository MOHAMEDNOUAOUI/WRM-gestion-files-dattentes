package com.wora.waitinglistforanyproject.DTO.WaitingList.embd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WaitingListembd {
    private Long id;
    private LocalDate date;
    private String algorithme;
    private Integer capacity;
}
