package myFitnessPallClone;

import java.util.Arrays;

public class ProductCatalog {
    Product[] products;
    final int maxNumberOfProducts = 100;
    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].toString());
        }

    }

    public boolean addProduct(Product product) {
        //adaug produsul primit ca parametru in lista la pozitia numberOfProducts+1

        //daca produsul se afla deja in lista sau am atins numarul de produse maxim, return false
        // altfel adaugam produsul in lista si crestem contorul

        //parcurg lista si verific daca produsul meu se afla in lista
        //daca se se afla sau am atins numarul maxim de produse

        if (isProductAdded(product) || maxNumberOfProducts == numberOfProducts) {
            return false;
        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
            return true;
        }
    }


    public boolean isProductAdded(Product product) {
        //parcurg lista de produse
        //pentru fiecare produs, verifica daca e egal cu produsul primit ca parametru
        //daca da, returnam true
        //return false

        if (numberOfProducts == 0){
            return false;
        }
        for (int i = 0; i < products.length; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }

//            if (product.equals(products[i])) {
//                System.out.println("Produsul " + product.name + " se află deja în listă.");
//                return false;
//            }
//        }
//        if (numberOfProducts >= maxNumberOfProducts) {
//            System.out.println("Lista este plina. Nu se pot adauga alte produse");
//            return false;
//        }
//        products[numberOfProducts] = product;
//        numberOfProducts++;
//        System.out.println("Produsul " + product.name + " a fost adaugat in lista");
//        return true;



    public Product getProductByName(String name) {
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.equals(name)) {
                return products[i];
            }
        }
        //daca nu am gasit produsul in lista

        return null;
    }

    public boolean deleteProduct(String name) {
        //int getProductByName = getProductByName(name);


        return true;

    }
}




