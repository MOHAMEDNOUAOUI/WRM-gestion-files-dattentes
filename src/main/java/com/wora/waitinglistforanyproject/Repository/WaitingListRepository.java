package com.wora.waitinglistforanyproject.Repository;

import com.wora.waitinglistforanyproject.Entity.WaitingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaitingListRepository extends JpaRepository<WaitingList , Long> {
}
