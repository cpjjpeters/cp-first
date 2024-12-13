package be.ipeters.cp_first.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/* carlpeters created on 13/12/2024 inside the package - be.ipeters.cp_first.web.model */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CpDto {
    private UUID id;
    private String cpName;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;
    private CpStyle cpStyle;
    private BigDecimal price;
    private Integer quantity;
    private String description;
    private Double yield;


}
