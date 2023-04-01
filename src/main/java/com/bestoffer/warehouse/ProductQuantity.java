package com.bestoffer.warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductQuantity {

    private Product product;

    private Integer quantity;

    public ProductQuantity(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }




}
