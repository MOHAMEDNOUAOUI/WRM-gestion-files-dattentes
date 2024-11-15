package com.wora.waitinglistforanyproject.DTO.VisitorList;

import com.wora.waitinglistforanyproject.DTO.Visitor.embd.VisitorEmbd;
import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitorDTOforSJF {

    private VisitorEmbd visitor;
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private VisiteurStatus status;
    private Integer estimatedProcessingTime;

}
