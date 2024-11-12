package com.wora.waitinglistforanyproject.Service;

import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;

public interface WaitingListService {
    ResponseDTO createWaitingList(CreateListDTO createListDTO);

}
