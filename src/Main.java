import Enums.Gender;
import Package1.Clients;
import Package1.Magazin;
import Package1.Product;
import Package3.DataBase;
import RealiseMethods.Methods;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clients clients1=new Clients("Abu",24, Gender.MALE,"qwe@gmail.com","1111");
        Clients clients2=new Clients("Kanzhar",24, Gender.MALE,"abc@gmail.com","2222");
        Clients clients3=new Clients("Liz",18, Gender.FEMALE,"aabb@gmail.com","3333");
        Clients clients4=new Clients("Maya",30, Gender.FEMALE,"bbbbb@gmail.com","4444");
        List<Clients>clientsList=new ArrayList<>(List.of(clients1,clients2,clients3,clients4));
        List<Clients>clients=new ArrayList<>(List.of(clients1,clients2));
        List<Clients>clients5=new ArrayList<>(List.of(clients3,clients4));

        Product product1=new Product("Bread",25,"nan");
        Product product2=new Product("Milk",60,"sut");
        Product product3=new Product("Chocolate",25,"shokolat");
        Product product4=new Product("Banan",15,"afrika");
        List<Product>productList=new ArrayList<>(List.of(product1,product2,product3,product4));
        List<Product>products=new ArrayList<>(List.of(product1,product2));
        List<Product>products1=new ArrayList<>(List.of(product3,product4));

        Magazin magazin1=new Magazin("Frunze","Chui 145",products,clients);
        Magazin magazin2=new Magazin("Globus","Kievskaya 145",products1,clients5);
        List<Magazin>magazins=new ArrayList<>(List.of(magazin2,magazin1));

        DataBase dataBase=new DataBase(clientsList,magazins,productList);

        Methods methods=new Methods(dataBase);
        methods.getAllProducts();
        System.out.println("===============================");
        methods.getAllClients();
        System.out.println("===============================");
        methods.getAllMagazins();
        System.out.println("===============================");
        methods.addProductToMagazin("Frunze",product1);
        methods.getAllMagazins();
        System.out.println("===============================");
        methods.deleteProduct("Globus",product3);
        methods.getAllMagazins();
        System.out.println("===============================");
        methods.searchByname("frunze");









    }
}