package com.wora.waitinglistforanyproject.Entity;

import com.wora.waitinglistforanyproject.Entity.Enum.VisiteurStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "visitor")
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "visitor" , fetch = FetchType.EAGER)
    private Set<VisitList> visitLists;

}
