package com.wora.waitinglistforanyproject.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "algorithme")
    private String algorithme;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "waitingList" , fetch = FetchType.EAGER)
    private Set<VisitList> visitLists;
}
