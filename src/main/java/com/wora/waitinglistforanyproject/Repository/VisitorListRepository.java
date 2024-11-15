package com.wora.waitinglistforanyproject.Repository;

import com.wora.waitinglistforanyproject.Entity.Embd.EmbeddableIds;
import com.wora.waitinglistforanyproject.Entity.VisitList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitorListRepository extends JpaRepository<VisitList , EmbeddableIds> {
    List<VisitList> findALlByOrderByArrivalTimeAsc();
}
