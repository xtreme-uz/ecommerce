package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoleDTO implements DTO<Long> {

    private Long id;

    private String name;

    private List<PermissionDTO>  permissions;

}
