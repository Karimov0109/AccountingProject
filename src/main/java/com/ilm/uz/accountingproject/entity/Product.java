package com.ilm.uz.accountingproject.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Long productPrice;

    @OneToMany(targetEntity = Transaction.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private List<Transaction> transactions;
}
