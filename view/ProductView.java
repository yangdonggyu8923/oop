package view;

import model.Product;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

public class ProductView {
    public static void main(String[] args) {
        UtilService util = UtilServiceImpl.getInstance();
        Product product = Product.builder()
                .pno(util.createRandomInteger(1,10))
                .name(util.createRandomName())
                .company(util.createRandomCompany())
                .price(util.createRandomInteger(100000,1000000))
                .build();

        System.out.println(product.toString());
    }
}
