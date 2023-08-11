package myFitnessPallClone;

import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option, productCatalog, scanner);
        } while (option != 6);
    }

    public static void printMenu() {
        System.out.println("Meniu: ");
        System.out.println("1. Adauga produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. EXIT");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Aleg optiunea cu numarul: ");

    }

    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner) {
        switch (option) {
            case 1:
                //citim de la tastatura detaliiele produsului
                //ne instantiem un produs cu aceste detalii
                //pasam obiectul creat la metoda addProduct

                System.out.println("Nume produs:");
                String name = scanner.next();
                System.out.println("Grasimi:");
                double fats = scanner.nextDouble();
                System.out.println("Carbohidrati:");
                double carbs = scanner.nextDouble();
                System.out.println("Proteine:");
                double proteins = scanner.nextDouble();

                Product newProduct = new Product(name, fats, carbs, proteins);
                boolean result = productCatalog.addProduct(newProduct);
                if (result){
                    System.out.println("Produsul " + newProduct.name + " a fost adaugat in lista");
                    System.out.println(Product.computeCalories(fats,carbs,proteins)+ " calorii");

                }else {
                    System.out.println("Produsul " + newProduct.name + " nu poate fi adagat in lista");
                }


                break;

            case 2:
                System.out.println("Nume produs:");
                name = scanner.next();
                System.out.println("Grasimi:");
                fats = scanner.nextDouble();
                System.out.println("Carbohidrati:");
                carbs = scanner.nextDouble();
                System.out.println("Proteine:");
                proteins = scanner.nextDouble();
                System.out.println(Product.computeCalories(fats,carbs,proteins));
                break;
            case 3:
                productCatalog.printProducts();
                break;
            case 4:
                System.out.println("Nume: ");
                name = scanner.next();
                boolean deleteResult = productCatalog.deleteProduct(name);
                if (deleteResult){
                    System.out.println("Produsul " + name+ " a fost sters din lista");

                }else{
                    System.out.println("Produsul " + name+ " nu se afla in lista");
                }
                break;
            case 5:
                System.out.println("Nume produs: ");
                name = scanner.next();
                Product product1 = productCatalog.getProductByName(name);
                if (product1 == null){
                    System.out.println("Produsul" + name + " nu se afla in lista");
                }else {
                    System.out.println(product1);

                }
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Optiune invalida. Reintroduceti optiunea: ");

        }
    }
}
