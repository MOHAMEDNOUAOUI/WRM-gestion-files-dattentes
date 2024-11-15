package com.wora.waitinglistforanyproject.Service;

import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorListResponseDTO;

import java.util.List;

public interface VisitorListService {

    List<VisitorListResponseDTO> getAllVisitorList();

}
