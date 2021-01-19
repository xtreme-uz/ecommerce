package uz.xtreme.ecommerce.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PageDTO {

    private int totalPages;

    private long totalElements;

    private Object content;

}
