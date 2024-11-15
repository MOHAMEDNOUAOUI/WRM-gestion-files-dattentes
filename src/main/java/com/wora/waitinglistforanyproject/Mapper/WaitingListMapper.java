package com.wora.waitinglistforanyproject.Mapper;


import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.embd.WaitingListAlgoResponse;
import com.wora.waitinglistforanyproject.Entity.WaitingList;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WaitingListMapper {
    WaitingList toEntity(CreateListDTO createListDTO);
    ResponseDTO toResponse(WaitingList waitingList);
    WaitingListAlgoResponse toALgoResponse(WaitingList waitingList);
}
