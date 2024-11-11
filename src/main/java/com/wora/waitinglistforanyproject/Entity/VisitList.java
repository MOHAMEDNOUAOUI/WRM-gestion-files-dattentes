package com.wora.waitinglistforanyproject.Entity;


import com.wora.waitinglistforanyproject.Entity.Embd.EmbedableIds;
import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "VisitList")
public class VisitList {
    @EmbeddedId
    private EmbedableIds embedableIds;

    @Column(name = "arrivalTime")
    private LocalDateTime arrivalTime;

    @Column(name = "startTime")
    private LocalTime startTime;

    @Column(name = "endTime")
    private LocalTime endTime;

    @Column(name = "status")
    private VisiteurStatus status;

    //(applicable pour l’algorithme SJF).
    @Column(name = "estimatedProcessingTime")
    private Integer estimatedProcessingTime;

    //(applicable pour l’algorithme HPF)
    @Column(name = "priority")
    private Integer priority;

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @MapsId("visitor_id")
    private Visitor visitor;

    @MapsId("waitinglist_id")
    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private WaitingList waitingList;
}
