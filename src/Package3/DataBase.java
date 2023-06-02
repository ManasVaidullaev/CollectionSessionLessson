package Package3;

import Package1.Clients;
import Package1.Magazin;
import Package1.Product;
import java.util.List;

public class DataBase {
    List<Clients>clients;
    List<Magazin>magazins;
    List<Product>products;

    public DataBase(List<Clients> clients, List<Magazin> magazins, List<Product> products) {
        this.clients = clients;
        this.magazins = magazins;
        this.products = products;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public void setClients(List<Clients> clients) {
        this.clients = clients;
    }

    public List<Magazin> getMagazins() {
        return magazins;
    }

    public void setMagazins(List<Magazin> magazins) {
        this.magazins = magazins;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
