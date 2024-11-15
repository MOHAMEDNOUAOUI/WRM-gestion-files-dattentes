package com.wora.waitinglistforanyproject.Repository;

import com.wora.waitinglistforanyproject.Entity.WaitingList;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WaitingListRepository extends JpaRepository<WaitingList , Long> {

}
