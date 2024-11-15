package com.wora.waitinglistforanyproject.Mapper;

import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforFIFO;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforPriority;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforSJF;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorListResponseDTO;
import com.wora.waitinglistforanyproject.Entity.VisitList;
import com.wora.waitinglistforanyproject.Entity.Visitor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VisitorListMapper {
    VisitorListResponseDTO toDTOResponse(VisitList visitList);

    VisitorDTOforFIFO toFIFO(VisitList visitList);
    VisitorDTOforPriority toPriority(VisitList visitList);
    VisitorDTOforSJF toSJF(VisitList visitList);
}
