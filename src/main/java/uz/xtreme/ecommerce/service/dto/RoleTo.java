package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoleTo implements Dto<Long> {

    private Long id;

    private String name;

    private List<PermissionTo>  permissions;

}
