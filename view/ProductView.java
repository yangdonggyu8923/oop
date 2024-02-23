package view;

import builder.ProductBuilder;
import model.ProductDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

public class ProductView {
    public static void main(String[] args) {
        UtilService util = UtilServiceImpl.getInstance();
        ProductDto product = new ProductBuilder()
                .pno(util.createdRandomInteger(1,10))
                .name(util.createdRandomName())
                .company(util.createdRandomCompany())
                .price(util.createdRandomInteger(100000,1000000))
                .build();

        System.out.println(product.toString());

    }
}
