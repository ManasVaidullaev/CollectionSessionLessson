package Package1;

import java.util.List;

public class Magazin {
    private  String name;
    private String adress;
    private List<Product>products;
    private List<Clients>clients;

    public Magazin(String name, String adress, List<Product> products, List<Clients> clients) {
        this.name = name;
        this.adress = adress;
        this.products = products;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public void setClients(List<Clients> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "name='" + name + '\'' +
                "adress='" + adress + '\'' +
                "\nproducts=" + products +
                "\nclients=" + clients +
                '}';
    }
}
