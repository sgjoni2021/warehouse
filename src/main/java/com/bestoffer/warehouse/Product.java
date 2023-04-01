package com.bestoffer.warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    private String description;
    private String typeOfProduct;
    private Double price;
    private Integer yearOfProduction;
    private String capacityOfProduct;
    private String processing;






}
