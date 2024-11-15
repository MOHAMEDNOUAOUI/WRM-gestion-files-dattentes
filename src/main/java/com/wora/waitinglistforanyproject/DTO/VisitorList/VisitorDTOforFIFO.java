package com.wora.waitinglistforanyproject.DTO.VisitorList;

import com.wora.waitinglistforanyproject.DTO.Visitor.embd.VisitorEmbd;
import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitorDTOforFIFO {
    private VisitorEmbd visitor;
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private VisiteurStatus status;
}
