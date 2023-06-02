package Interface;

import Package1.Magazin;
import Package1.Product;

import java.util.List;

public interface SevicesMethods {
    void getAllProducts();
    void getAllClients();
    void getAllMagazins();
    void searchByname(String nameUni);
    void addProductToMagazin(String name, Product product);
    void deleteProduct(String magName,Product product);

}
