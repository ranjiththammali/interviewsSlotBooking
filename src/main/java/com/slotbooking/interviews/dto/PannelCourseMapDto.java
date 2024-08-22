package com.slotbooking.interviews.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PannelCourseMapDto {
    @NotBlank(message = "Pannel name must not be blank")
    @Size(min = 1, message = "Pannel name must not be empty")
    String pannelName;


    @NotBlank(message = "Pannel name must not be blank")
    @Size(min = 1, message = "Pannel name must not be empty")
    String couseName;
}
