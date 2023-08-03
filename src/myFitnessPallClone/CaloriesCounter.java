package myFitnessPallClone;

import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();



        Scanner scanner = new Scanner(System.in);

        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();
            performSelectedAction(option,productCatalog,scanner);
        }while (option != 6);
    }
    public static void printMenu(){
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
    public static void performSelectedAction(int option,ProductCatalog productCatalog,Scanner scanner){
        switch (option){
            case 1:
                //citim de la tastatura detaliiele produsului
                //ne instantiem un produs cu aceste detalii
                //pasam obiectul creat la metoda addProduct
                String name = scanner.nextLine();
                double fats = scanner.nextDouble();
                double carbs = scanner.nextDouble();
                double proteins = scanner.nextDouble();
                Product newProduct = new Product(name,fats,carbs,proteins);
                productCatalog.addProduct(newProduct);
                productCatalog.printProducts();
                break;
                //2 apelam meteda computeCalories
                //3. apelam metoda printProduct








        }
    }
}
