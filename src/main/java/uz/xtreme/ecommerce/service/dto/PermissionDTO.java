package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

@Data
public class PermissionDTO implements DTO<Long> {

    private Long id;

    private String name;

}
