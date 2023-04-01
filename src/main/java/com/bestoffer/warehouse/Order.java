package com.bestoffer.warehouse;

import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
//a part date (type Date)
//* In addition, provide a method named getCost(type List<ProductQuantity>), amount that
//calculates the total cost of the order
    private Integer id;
    private ArrayList<ProductQuantity> productQuantities;
    private String description;
    private double cost;
    private LocalDate date;

    public Double getTotalAmount(List<ProductQuantity> productQuantities){
        double total=0.0;
        for (ProductQuantity element:productQuantities) {

           total= element.getQuantity()*element.getProduct().getPrice()+total;
        }
        return total;
    }





}
