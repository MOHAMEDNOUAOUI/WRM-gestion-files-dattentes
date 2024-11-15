package com.wora.waitinglistforanyproject.DTO.WaitingList;

import com.wora.waitinglistforanyproject.annotation.TodayDate;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CreateListDTO {

    @NotNull
    @TodayDate
    private LocalDate date;
    private String algorithm;
    private Integer capacity;

}
