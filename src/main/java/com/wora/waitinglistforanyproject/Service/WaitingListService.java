package com.wora.waitinglistforanyproject.Service;

import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.embd.WaitingListAlgoResponse;

import java.util.List;

public interface WaitingListService {
    ResponseDTO createWaitingList(CreateListDTO createListDTO);
    List<WaitingListAlgoResponse> getAllWaitinglists();
}
