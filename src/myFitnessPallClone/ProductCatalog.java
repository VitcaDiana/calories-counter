package myFitnessPallClone;

import java.util.Arrays;

public class ProductCatalog {
    Product[] products;
    final int maxNumberOfProducts = 3;
    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        if (numberOfProducts == 0) {
            System.out.println("Nu sunt produse in lista");
        }
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

        if (getProductByName(product.name) !=null || maxNumberOfProducts == numberOfProducts) {
            return false;
        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
            return true;
        }
    }


//    public boolean isProductAdded(Product product) {
//        //parcurg lista de produse
//        //pentru fiecare produs, verifica daca e egal cu produsul primit ca parametru
//        //daca da, returnam true
//        //return false
//
//        if (numberOfProducts == 0) {
//            return false;
//        }
//        for (int i = 0; i < numberOfProducts; i++) {
//            if (product.name.equals(products[i].name)) {
//                return true;
//            }
//        }
//        return false;
//    }


    public Product getProductByName(String name) {
        //parcurg lista si verific daca numele tastat se afla in lista
        //daca il gasesc returnez produsul din lista care are numele egal cu cel primit de la tastatura
        //daca nu afisez ca nu l-am gasit in lista
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (name.equals(products[i].name)) {
                return products[i];
            }
        }
        //daca nu am gasit produsul in lista returnam null
        return null;

    }


    public boolean deleteProduct(String name) {
        //daca nu exista produse in lista afisez un mesaj
        // cautam produsul in lista in functie de nume si aflu pozitia lui
        //incepand cu pozitia unde l-am gasit mutam cu o pozitie la stanga
        //  elementele de dupa  si scadem numarul de elemente din lista
        //altfel afisam ca nu am gasit produsul in lista

        int index = getProductIndexByName(name);

        if (index == -1){
            return false;
        }
        for (int i = index; i< numberOfProducts-1;i++){
            products[i] = products[i+1];


        }
        numberOfProducts--;
        products[numberOfProducts] = null;
        return true;

    }
    public int getProductIndexByName(String name) {
        //parcurg lista si verific daca numele tastat se afla in lista
        //daca il gasesc returnez produsul din lista care are numele egal cu cel primit de la tastatura
        //daca nu afisez ca nu l-am gasit in lista
        if (numberOfProducts == 0) {
            return -1;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (name.equals(products[i].name)) {
                return i;
            }
        }

        return -1;

    }
}

//        if (numberOfProducts == 0) {
//            System.out.println("Nu sunt produse in lista");
//            return false;
//        }
//        Product productToDelete = null;
//        for (int i = 0; i < numberOfProducts; i++) {
//            if (products[i].name.equals(name)) {
//                productToDelete = products[i];
//
//            }
//
//            if (productToDelete != null) {
//                for (int j = i; j < numberOfProducts - 1 ; j++) {
//                    products[j] = products[j + 1];
//                }
//                numberOfProducts--;
//                System.out.println("Produsul " + productToDelete.name + " a fost sters din lista");
//                return true;
//
//            }
//
//
//        }
//        System.out.println("Produsul nu se afla in lista");
//        return false;
//    }












