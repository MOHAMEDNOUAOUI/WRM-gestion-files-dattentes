package com.wora.waitinglistforanyproject.DTO.WaitingList;

import com.wora.waitinglistforanyproject.DTO.Visitor.embd.VisitorEmbd;
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
    private String algorithm;
    private Integer capacity;
    // the list after
}
