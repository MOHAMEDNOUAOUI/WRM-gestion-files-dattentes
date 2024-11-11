package com.wora.waitinglistforanyproject.Repository;

import com.wora.waitinglistforanyproject.Entity.Embd.EmbedableIds;
import com.wora.waitinglistforanyproject.Entity.VisitList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorListRepository extends JpaRepository<VisitList , EmbedableIds> {
}
