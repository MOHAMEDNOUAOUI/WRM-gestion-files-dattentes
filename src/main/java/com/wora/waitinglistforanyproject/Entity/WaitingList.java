package com.wora.waitinglistforanyproject.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "waitinglist")
public class WaitingList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date" , nullable = false)
    private LocalDate date;

    @Column(name = "algorithm" , nullable = false)
    private String algorithm;

    @Column(name = "capacity" , nullable = false)
    private Integer capacity;

    @OneToMany(mappedBy = "waitingList" , fetch = FetchType.EAGER)
    private List<VisitList> visitLists;
}
