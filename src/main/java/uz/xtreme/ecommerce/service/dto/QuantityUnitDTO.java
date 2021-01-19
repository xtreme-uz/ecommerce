package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

@Data
public class QuantityUnitDTO implements DTO<Long> {

    private Long id;

    private String name;

    private String description;

    private QuantityUnitDTO baseUnit;

    private Float difference;

}
