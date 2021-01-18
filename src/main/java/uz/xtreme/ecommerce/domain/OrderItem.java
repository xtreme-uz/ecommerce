package uz.xtreme.ecommerce.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ec_order_item")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Order order;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @OneToOne(fetch = FetchType.EAGER)
    private QuantityUnit quantityUnit;

}
