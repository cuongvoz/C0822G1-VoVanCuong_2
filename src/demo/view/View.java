package demo.view;


import demo.controller.ProductManagement;

import java.io.IOException;

public class View {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProductManagement productManagement = new ProductManagement();
        productManagement.display();
    }
}
