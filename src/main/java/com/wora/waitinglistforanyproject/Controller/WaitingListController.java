package com.wora.waitinglistforanyproject.Controller;


import com.wora.waitinglistforanyproject.DTO.WaitingList.CreateListDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.ResponseDTO;
import com.wora.waitinglistforanyproject.DTO.WaitingList.WaitingListProperties;
import com.wora.waitinglistforanyproject.DTO.WaitingList.embd.WaitingListAlgoResponse;
import com.wora.waitinglistforanyproject.Service.WaitingListService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/waiting-list")
@Validated
public class WaitingListController {

    @Autowired
    private WaitingListService waitingListService;

    @PostMapping
    public ResponseDTO createWaitingList(@Valid  @RequestBody CreateListDTO createListDTO){
        return waitingListService.createWaitingList(createListDTO);
    }

    @GetMapping
    public List<WaitingListAlgoResponse> getALlWaitingList() {
        return waitingListService.getAllWaitinglists();
    }
}
