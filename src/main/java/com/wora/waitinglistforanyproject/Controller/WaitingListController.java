package com.wora.waitinglistforanyproject.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/waiting-list")
public class WaitingListController {

    @GetMapping
    public String test() {
        return "testing";
    }

}
