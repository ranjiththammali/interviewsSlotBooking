package com.slotbooking.interviews.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PannelsDto {
    @NotBlank(message = "Panel name is mandatory")
    @Size(min = 2, max = 50, message = "Panel name must be between 2 and 50 characters")
    private String panelName;

    @NotNull(message = "Interview status is mandatory")
    private Boolean interview;

    @NotBlank(message = "Selection is mandatory")
    @Pattern(regexp = "^(YES|NO)$", message = "Selection must be either YES or NO")
    private String selection;
}
