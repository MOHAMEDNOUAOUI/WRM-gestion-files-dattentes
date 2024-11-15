package com.wora.waitinglistforanyproject.Entity;


import com.wora.waitinglistforanyproject.Entity.Embd.EmbeddableIds;
import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "visit_list")
public class VisitList {
    @EmbeddedId
    private EmbeddableIds embeddableIds;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private VisiteurStatus status;

    //(applicable pour l’algorithme SJF).
    @Column(name = "estimated_processing_time")
    private Integer estimatedProcessingTime;

    //(applicable pour l’algorithme HPF)
    @Column(name = "priority")
    private Integer priority;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("visitorId")
    private Visitor visitor;

    @MapsId("waitingListId")
    @ManyToOne(fetch = FetchType.EAGER)
    private WaitingList waitingList;
}
