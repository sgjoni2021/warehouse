package com.bestoffer.warehouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class WareHouse {

    HashMap<String,ProductQuantity> storage;

    public ProductQuantity getProductQuantity(String description){


        ProductQuantity productAndQuantity = this.storage.get(description);
        if (productAndQuantity.equals(null)){
            System.out.println("this product does not exists");
        }else {
            return productAndQuantity;
        }
        return productAndQuantity;
    }

    public void addProductQuantity(Product product, Integer quantity){
        ProductQuantity productQuantity = new ProductQuantity(product,quantity);
        return;


    }




}
