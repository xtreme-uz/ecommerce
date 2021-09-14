package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

@Data
public class PermissionTo implements Dto<Long> {

    private Long id;

    private String name;

}
