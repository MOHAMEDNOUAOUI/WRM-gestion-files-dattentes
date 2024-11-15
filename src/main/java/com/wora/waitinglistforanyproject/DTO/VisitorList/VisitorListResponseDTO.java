package com.wora.waitinglistforanyproject.DTO.VisitorList;

import com.wora.waitinglistforanyproject.DTO.Visitor.embd.VisitorEmbd;
import com.wora.waitinglistforanyproject.DTO.WaitingList.embd.WaitingListembd;
import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class VisitorListResponseDTO {
    private LocalDateTime arrivalTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private VisiteurStatus status;
    private Integer estimatedProcessingTime;
    private Integer priority;
    private VisitorEmbd visitor;
    private WaitingListembd waitingList;
}
