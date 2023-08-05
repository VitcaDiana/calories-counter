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
        if (numberOfProducts == 0){
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

        if (isProductAdded(product) || maxNumberOfProducts == numberOfProducts) {
            System.out.println("Produsul " + product.name + " nu poate fi adagat in lista");
            return false;
        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
            System.out.println("Produsul " + product.name + " a fost adaugat in lista");
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
        for (int i = 0; i < numberOfProducts; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }



    public Product getProductByName(String name) {
        //parcurg lista si verific daca numele tastat se afla in lista
        //daca il gasesc returnez produsul din lista care are numele egal cu cel primit de la tastatura
        //daca nu afisez ca nu l-am gasit in lista
        for (int i = 0; i < numberOfProducts; i++) {
            if (name.equals(products[i].name)) {
                return products[i] ;
            }

        }

        //daca nu am gasit produsul in lista returnam null

        System.out.println("Produsul nu se afla in lista");
        return null;

    }
//    public int searchProductByName(String name){
//        for (int i = 0; i< numberOfProducts;i++){
//            if (product.name.equals(products[i].name)){
//                return i;
//            }
//        }
//       return -1;
//
//    }

    public boolean deleteProduct(String name) {
        // cautam produsul in lista in functie de nume
        //daca nu am gasit produsul in lista returnam false
        //altfel stergem produsul din lista si returnam true

//        int productIndex = isProductAdded(products);
//        if (productIndex == -1){
//            System.out.println("Produsul nu se afla in lista ");
//            return false;
//        }else {
//            for (int i = productIndex; i < numberOfProducts - 1; i++){
//                products[i] = products[i + 1];
//            }
//            products[numberOfProducts - 1] = null;
//            numberOfProducts--;
//            System.out.println("Produsul a fost sters din lista");
            return true;


        }




    }





