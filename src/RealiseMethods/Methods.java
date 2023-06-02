package RealiseMethods;

import Interface.SevicesMethods;
import Package1.Magazin;
import Package1.Product;
import Package3.DataBase;

import java.security.Provider;
import java.util.List;

public class Methods implements SevicesMethods {
    private DataBase dataBase;

    public Methods(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void getAllProducts() {
        for (int i = 0; i < dataBase.getMagazins().size(); i++) {
            System.out.println(dataBase.getMagazins().get(i).getProducts());

        }

    }

    @Override
    public void getAllClients() {
        System.out.println(dataBase.getClients());

    }

    @Override
    public void getAllMagazins() {
        System.out.println(dataBase.getMagazins());

    }

    @Override
    public void searchByname(String nameUni) {
        for (int i = 0; i < dataBase.getMagazins().size(); i++) {
            if (nameUni.equalsIgnoreCase(dataBase.getMagazins().get(i).getName())){
                System.out.println(dataBase.getMagazins().get(i));}}

        for (int i = 0; i < dataBase.getClients().size(); i++) {
            if (nameUni.equalsIgnoreCase(dataBase.getClients().get(i).getName())){
                System.out.println(dataBase.getClients().get(i));}}

        for (int i = 0; i < dataBase.getProducts().size(); i++) {
            if (nameUni.equalsIgnoreCase(dataBase.getProducts().get(i).getName())){
                System.out.println(dataBase.getProducts().get(i));
            }}
    }

    @Override
    public void addProductToMagazin(String name, Product product) {
        for (int i = 0; i < dataBase.getMagazins().size(); i++) {
            if (name.equalsIgnoreCase(dataBase.getMagazins().get(i).getName())){
                dataBase.getMagazins().get(i).getProducts().add(product);
            }
        }
    }

    @Override
    public void deleteProduct(String magName, Product product) {
        for (int i = 0; i < dataBase.getMagazins().size(); i++) {
            if (magName.equalsIgnoreCase(dataBase.getMagazins().get(i).getName())){
                dataBase.getMagazins().get(i).getProducts().remove(product);
            }
        }

    }
}
