package uz.xtreme.ecommerce.rest.vm;

import lombok.Data;

@Data
public class JwtTokenVM {

    private String token;

    public JwtTokenVM(String token) {
        this.token = token;
    }
}
