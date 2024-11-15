package com.wora.waitinglistforanyproject.Service.impl;

import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforFIFO;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforPriority;
import com.wora.waitinglistforanyproject.DTO.VisitorList.VisitorDTOforSJF;
import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.WaitingListProperties;
import com.wora.waitinglistforanyproject.DTO.WaitingList.embd.WaitingListAlgoResponse;
import com.wora.waitinglistforanyproject.Entity.WaitingList;
import com.wora.waitinglistforanyproject.Mapper.WaitingListMapper;
import com.wora.waitinglistforanyproject.Repository.WaitingListRepository;
import com.wora.waitinglistforanyproject.Service.WaitingListService;
import com.wora.waitinglistforanyproject.helpers.Algorithm;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class WaitingListServiceImpl implements WaitingListService {

    private final WaitingListRepository waitingListRepository;
    private final WaitingListMapper waitingListMapper;
    private final WaitingListProperties waitingListProperties;
    private final Algorithm algorithm;

    @Override
    public ResponseDTO createWaitingList(CreateListDTO createListDTO) {
        if (createListDTO.getAlgorithm() == null) {
            createListDTO.setAlgorithm(waitingListProperties.getAlgorithm());
        }

        if (createListDTO.getCapacity() == null){
            createListDTO.setCapacity(waitingListProperties.getCapacity());
        }

        WaitingList waitingList = waitingListMapper.toEntity(createListDTO);

        WaitingList savedWaitingList = waitingListRepository.save(waitingList);
        return waitingListMapper.toResponse(savedWaitingList);
    }

    @Override
    public List<WaitingListAlgoResponse> getAllWaitinglists() {
        return waitingListRepository.findAll().stream().map(waitingList -> {
            WaitingListAlgoResponse response = waitingListMapper.toALgoResponse(waitingList);
            List<?> visitList = algorithm.checkAlgorithm(waitingList);
            response.setVisitLists(visitList);
            return response;
        }).toList();
    }
    





}
