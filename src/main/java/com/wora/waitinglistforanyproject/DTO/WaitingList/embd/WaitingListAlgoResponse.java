package com.wora.waitinglistforanyproject.DTO.WaitingList.embd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaitingListAlgoResponse {
    private Long id;
    private LocalDate date;
    private String algorithm;
    private Integer capacity;
    private List<?> visitLists;
}
