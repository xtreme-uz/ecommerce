package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

@Data
public class EcUserDTO {

    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

}
