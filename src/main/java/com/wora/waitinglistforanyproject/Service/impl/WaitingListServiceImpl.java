package com.wora.waitinglistforanyproject.Service.impl;

import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;
import com.wora.waitinglistforanyproject.Entity.WaitingList;
import com.wora.waitinglistforanyproject.Mapper.WaitingListMapper;
import com.wora.waitinglistforanyproject.Repository.WaitingListRepository;
import com.wora.waitinglistforanyproject.Service.WaitingListService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class WaitingListServiceImpl implements WaitingListService {

    private final WaitingListRepository waitingListRepository;
    private final WaitingListMapper waitingListMapper;

    @Override
    public ResponseDTO createWaitingList(CreateListDTO createListDTO) {
        WaitingList waitingList = waitingListMapper.toEntity(createListDTO);
        WaitingList savedWaitingList = waitingListRepository.save(waitingList);
        return waitingListMapper.toResponse(savedWaitingList);
    }
}
