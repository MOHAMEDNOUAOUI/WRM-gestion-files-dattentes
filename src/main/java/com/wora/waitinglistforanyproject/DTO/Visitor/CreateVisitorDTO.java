package com.wora.waitinglistforanyproject.DTO.Visitor;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateVisitorDTO {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
}
