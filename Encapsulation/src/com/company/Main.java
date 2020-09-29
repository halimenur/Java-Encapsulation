package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product=new Product(1,"Lenova","Bilgisayar");

//         Product product=new Product();
//        product.set_name("Laptop");
//        product.setId(1);
//        product.set_description("Lenova");
//        product.set_stockPiece(5);
//        product.set_renk("gri");


        //System.out.println(product.get_description());
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        //System.out.println(product.get_kod());
    }
}
