package gb.javacore.lesson4.Model;
/* 
@author Sergey Ryadchikov
 */

import java.util.LinkedList;


public class ListProducts {
    private LinkedList<Product> listProduct = new LinkedList<>();

    public ListProducts(Product...products) {
        for(Product prod : products){
            listProduct.add(prod);
        }
    }

    public LinkedList<Product> getListProduct() {
        return listProduct;
    }
}
