package com.wora.waitinglistforanyproject.Controller;


import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;
import com.wora.waitinglistforanyproject.Service.WaitingListService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/waiting-list")
public class WaitingListController {

    @Autowired
    private WaitingListService waitingListService;

    @PostMapping
    public ResponseDTO createWaitingList(@RequestBody CreateListDTO createListDTO){
        ResponseDTO response =waitingListService.createWaitingList(createListDTO);
        return response;
    }
}
