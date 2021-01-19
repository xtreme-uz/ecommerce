package uz.xtreme.ecommerce.service.dto;

import lombok.Data;
import uz.xtreme.ecommerce.domain.CurrencyUnit;

import java.math.BigDecimal;

@Data
public class ProductDTO implements DTO<Long> {

    private Long id;

    private String name;

    private String description;

    private BigDecimal price;

    private CurrencyUnit currencyUnit;

    private BigDecimal quantity;

}
