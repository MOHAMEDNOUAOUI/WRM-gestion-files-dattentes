package com.wora.waitinglistforanyproject.Service.impl;

import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorListResponseDTO;
import com.wora.waitinglistforanyproject.Repository.VisitorListRepository;
import com.wora.waitinglistforanyproject.Service.VisitorListService;
import com.wora.waitinglistforanyproject.helpers.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorListServiceImpl implements VisitorListService {

    @Autowired
    private VisitorListRepository visitorListRepository;

    @Autowired
    private Algorithm algorithm;


    @Override
    public List<VisitorListResponseDTO> getAllVisitorList() {
        return List.of();
    }




}
