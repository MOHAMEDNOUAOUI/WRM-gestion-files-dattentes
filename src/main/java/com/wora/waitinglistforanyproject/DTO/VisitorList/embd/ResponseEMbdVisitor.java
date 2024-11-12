package com.wora.waitinglistforanyproject.DTO.VisitorList.embd;

import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEMbdVisitor {

    private Long visitor_id;
    private Long waitinglist_id;
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private VisiteurStatus status;
    private Integer estimatedProcessingTime;
    private Integer priority;
}
