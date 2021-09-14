package uz.xtreme.ecommerce.service.dto;

import lombok.Data;

@Data
public class UserTo implements Dto<Long> {

    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

}
