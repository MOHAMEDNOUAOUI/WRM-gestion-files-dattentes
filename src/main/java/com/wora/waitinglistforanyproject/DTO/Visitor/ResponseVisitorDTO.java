package com.wora.waitinglistforanyproject.DTO.Visitor;


import com.wora.waitinglistforanyproject.DTO.WaitingList.embd.WaitingListembd;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVisitorDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private WaitingListembd waitingList;
}
