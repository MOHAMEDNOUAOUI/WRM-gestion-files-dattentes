package com.wora.waitinglistforanyproject.Repository;

import com.wora.waitinglistforanyproject.Entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor,Long> {
}
